/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 *
 * 2016년
 *
 * 문제 설명
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
 * 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 *
 * 제한 조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 *
 * 입출력 예
 * a	b	result
 * 5	24	TUE
 *
 * 2019.6.22 Dakyung Ko
 */

package level1.practice;

public class Solution01_1 {
    public String solution(int a, int b) {
        String[] value = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;

        days += dayCount(a);
        days += b;

        return value[days % 7];
    }
    private static int dayCount(int m) {
        int count = 0;
        int std = 8;

        if(m < 8) {
            std = m;
        }

        for(int i=1; i<std; i++) { // 1 ~ 7
            if(i == 2) count += 29;
            else if(i % 2 == 1) count += 31;
            else if(i % 2 == 0) count += 30;
        }

        if(m < 8) return count;

        for(int i=8; i<m; i++) { // 8 ~ 12
            if(i % 2 == 0) count += 31;
            else if(i % 2 == 1) count += 30;
        }
        return count;
    }

}
