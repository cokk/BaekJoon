/**
 * 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 문제 설명
 *
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 *
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 입출력 예
 * s	    n	result
 * AB	    1	BC
 * z	    1	a
 * a B z	4	e F d
 *
 * 2019.6.26
 */
package level1.practice;

public class Solution14 {
//    private static final String s = "AB"; // result BC
//    private static final String s = "z"; // result a
//    private static final int n = 1;
    private static final String s = "a B z"; // result e F d
    private static final int n = 4;

    public static void main(String[] args) {
        System.out.println(solution(s, n));
    }
    public static String solution(String s, int n) {
        char[] charArray = new char[s.length()];
        int i=0;
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                charArray[i] = (char) (c + n);
                if (Character.isUpperCase(c) && charArray[i] > 'Z') charArray[i] -= 26;
                if (Character.isLowerCase(c) && charArray[i] > 'z') charArray[i] -= 26;
            } else  {
                charArray[i] = c;
            }
            i++;
        }

        return String.valueOf(charArray);
    }
}
