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

import java.util.HashMap;
import java.util.Map;

public class Solution01_2 {

//    private final static int a = 5;
//    private final static int b = 24; // result TUE
    private final static int a = 1;
    private final static int b = 7; // result THU

    public static void main(String[] args) {
        System.out.println(solution(a, b));
    }

    public static String solution(int m, int d) {
//        String[] value = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;

        days += dayCount(m, true);
        days += d;

        // std is January 1
        return dayOfTheWeek(days, "FRI");
    }

    private static int dayCount(int m, boolean isLeapYear) {
        int count = 0;
        int std = 8;

        if(m < 8) std = m;

        for(int i=1; i<std; i++) { // 1 ~ 7
            if(i == 2 && isLeapYear) count += 29;
            if(i == 2 && !isLeapYear) count += 28;
            if(i % 2 == 1) count += 31;
            if(i != 2 && i % 2 == 0) count += 30;
        }

        if(m < 8) return count;

        for(int i=8; i<m; i++) { // 8 ~ 12
            if(i % 2 == 0) count += 31;
            else if(i % 2 == 1) count += 30;
        }
        return count;
    }

    private static String dayOfTheWeek(int days, String std) {
        Map<String, Integer> map = new HashMap<>();
        map.put("SUN", 0);
        map.put("MON", 1);
        map.put("TUE", 2);
        map.put("WED", 3);
        map.put("THU", 4);
        map.put("FRI", 5);
        map.put("SAT", 6);

        int numStd = map.get(std) - 1;
        int result = days % 7 + numStd;
        if (result >= 7) result -= 7;

        return getKey(map, result);
    }

    private static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
