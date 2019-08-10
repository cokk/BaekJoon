package sort.dp;

import java.util.*;

public class Bj_2624 {

    private static final String value = "20\n" +
            "3\n" +
            "5 3\n" +
            "10 2\n" +
            "1 5";
//    static int t = 20;
    static int k = 3;
    static TreeMap<Integer, Integer> coin = new TreeMap<>();
    static int[] d = new int[100];
    static int count = 0;

    public static void main (String[] args) {

        int t = 20;

        coin.put(5, 3);
        coin.put(10, 2);
        coin.put(1, 5);

        System.out.println(solution2(t));
    }

    public static int solution2(int t) {
        if(t == 1) return 0;
        if(d[t] > 0) return 0;

        Iterator<Integer> iteratorKey = coin.descendingKeySet().iterator();


        while(iteratorKey.hasNext()) {
            Integer key = iteratorKey.next(); // 10 // 5 // 1

            if(key <= t) {
                for (int i = coin.get(key); i >= 0; i--) { // 2, 1, 0 // 3, 2, 1, 0 // 5~
                    if (key * i == t) d[t] += 1; // 딱 나누어 떨어질 때 // 일부만 쓰일 때
                    if (key * i < t && i > 0 && iteratorKey.hasNext())
                        d[t] += solution2(t - key * i); // t = 10일 때
                }
            }
        }

        return d[t];
    }

    public static String solution(String input) {
        coin.put(5, 3);
        coin.put(10, 2);
        coin.put(1, 5);

        int count = 0;
        int t = 20;

        Iterator<Integer> iteratorKey = coin.descendingKeySet().iterator();
        while(iteratorKey.hasNext()) {
            Integer key = iteratorKey.next(); // 10, 5, 1
            System.out.println(key);

            for(int i=coin.get(key); i>=0; i--) { // 2개, 3개, 5개
                if (key * i == t) count++;
                if (key * i < t) {
                    t = t - key * i;
//                    solution1()
                    break;
                }
            }
        }

        int[] p = {5, 10, 1};
        int[] n = {3, 2, 5};

        for(int i=0; i<k; i++) {

        }

        return null;
    }
}
