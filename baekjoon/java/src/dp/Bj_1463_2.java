package dp;

import java.util.Scanner;

public class Bj_1463_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        d[1] = 0;
        System.out.println(logic(n, d));
    }

    public static int logic(int n, int[] d) {
        if (n <= 1) return 0;
        if (d[n] > 0) return d[n];

        d[n] = logic(n - 1, d) + 1;
        if (n % 3 == 0) {
            int tmp = logic(n / 3, d) + 1;
            if (d[n] > tmp) d[n] = tmp;
        } else if (n % 2 == 0) {
            int tmp = logic(n / 2, d) + 1;
            if (d[n] > tmp) d[n] = tmp;
        }
        return d[n];
    }
}
