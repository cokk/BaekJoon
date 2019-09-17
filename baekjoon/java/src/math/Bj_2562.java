package math;

import java.util.Scanner;

public class Bj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
                index = i;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
