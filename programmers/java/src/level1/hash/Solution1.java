/**
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * 문제 설명
 *
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	completion	return
 * [leo, kiki, eden]	[eden, kiki]	leo
 * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
 * [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
 * 입출력 예 설명
 * 예제 #1
 * leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * 예제 #2
 * vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * 예제 #3
 * mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 *
 * 2019.6.28
 */
package level1.hash;

import java.util.*;

public class Solution1 {
//    private static String[] participant = {"leo", "kiki", "eden"};
//    private static String[] completion = {"eden", "kiki"}; // return leo
    private static String[] participant = {"mislav", "stanko", "mislav", "ana"};
    private static String[] completion = {"stanko", "ana", "mislav"}; // return mislav

    public static void main(String[] args) {
        System.out.println(solution(participant, completion));
    }

    // O(n)
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";

        for (String p : participant) {
            if (map.containsKey(p)) map.put(p, map.get(p) + 1);
            else map.put(p, 1);
        }

        for (String c : completion) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c), map.get(c) - 1);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) answer = key;
        }

        return answer;
    }

    // 시간 초과
    public static String solution2(String[] participant, String[] completion) {
        List<String> pList = new ArrayList<>();
        for (String p : participant)
            pList.add(p);
        for (String c : completion) { // O(n*n)
            pList.remove(c); // O(n)
        }
        return pList.get(0);
    }

    // O(nlogn)
    public static String solution3(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }
        return participant[i];
    }
}
