package level5;

import java.util.Stack;

public class Solution17682 {
//    static String dartResult = "1S2D*3T"; // 37
    static String dartResult = "1D2S#10S"; // 9

    public static int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c == 'S') {

            } else if (c == 'D') {
                Integer pop = s.pop();
                s.push((int)Math.pow(pop, 2));
            } else if (c == 'T') {
                Integer pop = s.pop();
                s.push((int)Math.pow(pop, 3));
            } else if (c == '*') {
                if (s.size() >= 2) {
                    Integer tmp = s.pop() * 2;
                    s.push(s.pop() * 2);
                    s.push(tmp);
                } else {
                    s.push(s.pop() * 2);
                }
            } else if (c == '#') {
                s.push(s.pop() * -1);
            } else if (c >= '0' && c <= '9'){
                if (c == '0' && !s.empty() && s.peek() == 1)  {
                    s.pop();
                    s.push(10);
                } else {
                    s.push((int) c - '0');
                }
            }
        }

        while (!s.empty()) {
            answer += s.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(dartResult));
    }
}
