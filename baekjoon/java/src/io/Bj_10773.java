package io;

import java.util.Scanner;
import java.util.Stack;

public class Bj_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        while (n-- > 0) {
            int v = sc.nextInt();
            if (v != 0) s.push(v);
            else s.pop();
        }

        int sum = 0;
        int size = s.size();
        while (size-- > 0) sum += s.pop();

        System.out.println(sum);
    }
}
