/**
 * 최대공약수와 최소공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 *
 * 문제 설명
 *
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 * 입출력 예
 * n	m	return
 * 3	12	[3, 12]
 * 2	5	[1, 10]
 * 입출력 예 설명
 * 입출력 예 #1
 * 위의 설명과 같습니다.
 * 입출력 예 #2
 * 자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
 *
 * 2019.6.27
 */
package level1.practice;

public class Solution23 {

//    private static final int n = 3;
//    private static final int m = 12; // 3, 12
    private static final int n = 2;
    private static final int m = 5; // 1, 10
//    private static final int n = 24;
//    private static final int m = 16;

    public static void main(String[] args) {
        for (int i : solution(n, m)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n, int m) {
        return new int[]{gcd(n, m), gcm(n, m)};
//        return new int[]{basicGcd(n, m), basicGcm(n, m)};
    }

    // 최대 공약수
    private static int basicGcd(int a, int b) {
        int bigger = a > b ? a : b;
        for (int i = bigger; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }

    // 최소 공배수
    private static int basicGcm(int a, int b) {
        int bigger = a > b ? a : b;
        while (true) {
            if (bigger % a == 0 && bigger % b == 0) {
                return bigger;
            }
            bigger++;
        }
    }

    // 최대 공약수 (유클리드호제법)
    private static int gcd(int a, int b) {
        while (true) {
            int r = a % b;
            if (r == 0) return b;
            else {
                a = b;
                b = r;
            }
        }
    }

    // 최소 공배수 (유클리드호제법)
    private static int gcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
