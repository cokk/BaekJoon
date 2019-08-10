/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 *
 * 문제 설명
 *
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * 제한 조건
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 * a와 b의 대소관계는 정해져있지 않습니다.
 * 입출력 예
 * a	b	return
 * 3	5	12
 * 3	3	3
 * 5	3	12
 *
 * 2019.6.25
 */
package level1.practice;

public class Solution05 {
    private static final int a = 3;
    private static final int b = 5; // return 12

    public static void main(String[] args) {
        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        if(a == b) return a;

        long answer = 0;
        if(b > a) answer = allAdd(a, b);
        else answer = allAdd(b, a);

        return answer;
    }

    private static long allAdd(int a, int b) {
        long sum = 0;
        for(int i=a; i<=b; i++) {
            sum += i;
        }
        return sum;
    }
}
