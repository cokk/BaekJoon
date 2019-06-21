/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 *
 * 가운데 글자 가져오기
 *
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 *
 * 입출력 예
 * s	    return
 * abcde	c
 * qwer	    we
 *
 * 2019.6.21 Dakyung Ko
 */
package level1.practice;

public class Solution02 {

    private final static String s = "abcde";
//    private final static String s = "qwer";

    public static void main(String[] args) {
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int length = s.length();
        if(length % 2 == 0) sb.append(s.charAt(length/2 - 1));
        sb.append(s.charAt(length/2));

        return sb.toString();
    }
}
