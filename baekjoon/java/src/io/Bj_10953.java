package io;

import java.util.Scanner;

public class Bj_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String s = sc.next();
            String[] sp = s.split(",");
            System.out.println(Integer.valueOf(sp[0]) + Integer.valueOf(sp[1]));
        }
    }
}
