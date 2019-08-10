/**
 * 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 *
 * 문제 설명
 *
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 *
 * 2019.6.27
 */
package level1.practice;

public class Solution18 {
    private static long l = 12345; // return [5,4,3,2,1]

    public static void main(String[] args) {
        for (int i : solution(l)) {
            System.out.println(i);
        }
    }
    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        int i=0;
        while (n > 0) {
            answer[i] = (int) (n % 10);
            n = n / 10;
            i++;
        }

        return answer;
    }
}
