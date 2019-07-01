/**
 * 베스트앨범
 * https://programmers.co.kr/learn/courses/30/lessons/42579
 *
 * 문제 설명
 *
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다.
 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 * 제한사항
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 * 입출력 예
 * genres	plays	return
 * [classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
 * 입출력 예 설명
 * classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
 * 고유 번호 3: 800회 재생
 * 고유 번호 0: 500회 재생
 * 고유 번호 2: 150회 재생
 * pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
 * 고유 번호 4: 2,500회 재생
 * 고유 번호 1: 600회 재생
 * 따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
 * ※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.
 */

/**
 * 2019.7.2
 *
 * 추가적인 데이터를 너무 많이 만들어서 파악도 잘 안되고 불필요한 연산이 많아진 것 같다.
 * 그리고 중간 연산에서 map을 사용하지 않고 list를 사용해 불필요한 loop가 많아 3중 loop를 사용하게 되었다.
 * 정확성 테스트만 해서 통과는 되었지만 효율성은 떨어지는 코드라는 생각이 든다.
 * Map만을 이용하던가, 복잡한 데이터를 따로 Object로 작성해 풀이해봐야할 것 같다.
 */
package level3.hash;

import java.util.*;

public class Solution42579 {

//    private static String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//    private static int[] plays = {500, 600, 150, 800, 2500}; // 4, 1, 3, 0
//    private static String[] genres = {"classic", "classic", "classic"};
//    private static int[] plays = {1000, 1000, 800};
    private static String[] genres = {"classic", "pop", "pop", "test", "pop", "pop", "test2"};
    private static int[] plays = {1000, 1000, 800, 1900, 100, 200, 50}; // 1, 2, 3, 0, 6

    public static void main(String[] args) {
        for (int i : solution(genres, plays)) {
            System.out.println(i);
        }
    }
    public static int[] solution(String[] genres, int[] plays) {
        List<Integer> answerList = new ArrayList<>();

        Map<String, Integer> genresAndPlays = new TreeMap<>(); // 장르, 총 장르 재생수
        Map<Integer, String> numAndGenres = new HashMap<>(); // 곡번호, 장르
        Map<Integer, Integer> numAndPlays = new HashMap<>(); // 곡번호, 한 곡당 재생수

        // input data to map
        for (int i = 0; i < genres.length; i++) {
            genresAndPlays.put(genres[i], genresAndPlays.getOrDefault(genres[i], 0) + plays[i]);
            numAndGenres.put(i, genres[i]);
            numAndPlays.put(i, plays[i]);
        }

        // logic
        Iterator<String> genreIterator = sortByValue(genresAndPlays).iterator(); // play 기준으로 sort된 장르 리스트
        List<Integer> numSortListByPlay = sortByValue(numAndPlays); // play 기준으로 sort된 고유번호 리스트

        while (genreIterator.hasNext()) { // play 기준으로 sort된 장르로 순회
            String genre = genreIterator.next(); // 플레이수가 가장 많은 장르를 뽑아서
            List<Integer> genreNumList = getKey(numAndGenres, genre);// 장르에 해당하는 고유넘버들을 뽑는다.

            int genreCount = 0;
            Iterator<Integer> numSortByPlayIterator = numSortListByPlay.iterator();
            while (numSortByPlayIterator.hasNext()) { // play 기준으로 sort된 고유번호로 순회
                if (genreCount > 2) break;
                if (answerList.size() >= genresAndPlays.size() * 2) break;

                Integer songNumber = numSortByPlayIterator.next();
                for (int i = 0; i < genreNumList.size(); i++) {
                    if (songNumber == genreNumList.get(i)) { // 고유번호가 해당 genre의 번호면 뽑는다.
                        if (genreCount < 2) {
                            answerList.add(songNumber);
                            genreCount++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        // List to int arr
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private static <K, V> List<K> sortByValue(Map<K, V> map) {
        List<K> list = new ArrayList<>();
        list.addAll(map.keySet());

        Collections.sort(list, (o1, o2) -> {
            V v1 = map.get(o1);
            V v2 = map.get(o2);
            return ((Comparable)v2).compareTo(v1);
        });
        return list;
    }

    private static <K, V> List<K> getKey(Map<K, V> map, V value) {
        List<K> keyList = new ArrayList<>();
        Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            K key = iterator.next();
            if (value.equals(map.get(key)))
                keyList.add(key);
        }
        return keyList;
    }
}