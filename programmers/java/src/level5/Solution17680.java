package level5;

import java.util.LinkedList;
import java.util.Queue;

public class Solution17680 {

    //    static int cacheSize = 3;
//    static String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; // 21
    static int cacheSize = 0;
    static String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 50

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toLowerCase();
            if (q.contains(s)) {
                answer += 1;
                q.remove(s);
                q.add(s);
            } else {
                answer += 5;
                q.add(s);
                if (q.size() > cacheSize) q.remove();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(cacheSize, cities));
    }
}
