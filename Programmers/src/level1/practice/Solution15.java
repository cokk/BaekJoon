/**
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 *
 * 문제 설명
 *
 * 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * 제한 사항
 * n은 0 이상 3000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12	28
 * 5	6
 * 입출력 예 설명
 * 입출력 예 #1
 * 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
 * 입출력 예 #2
 * 5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
 *
 * 2019.6.26
 */
package level1.practice;

public class Solution15 {

    private static final int n = 12; //return 28

    public static void main(String[] args) {
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }
}
