/**
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 *
 * 문제 설명
 *
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * 입출력 예
 * s	return
 * try hello world	TrY HeLlO WoRlD
 * 입출력 예 설명
 * try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로,
 * 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 따라서 TrY HeLlO WoRlD 를 리턴합니다.
 *
 * 2019.6.26
 */
package level1.practice;

public class Solution16 {

//    private static final String s = "try hello world"; // return TrY HeLlO WoRlD
    private static final String s = "a  bac  ";

    public static void main(String[] args) {
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] strings = s.split(" ");
        for (String st : strings) {
            int i=0;
            for (char c : st.toCharArray()) {
                if (i % 2 == 0) answer.append(Character.toUpperCase(c));
                else if (i % 2 == 1) answer.append(Character.toLowerCase(c));
                i++;
            }
            if (answer.length() < s.length()) answer.append(" ");
        }
        while (answer.length() != s.length()) answer.append(" ");
        return answer.toString();
    }

}
