package dp;

import java.util.Scanner;

// Top-down
public class Bj_11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        boolean[] c = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
        }

        System.out.println(logic(n, d, c));
    }
    public static int logic(int n, int[] d, boolean[] c) {
        if (c[n] == true) return d[n];

        if (n == 0) {
            c[0] = true;
            return 0;
        }
        if (n == 1) {
            c[1] = true;
            return d[1];
        }

        for (int i = 1; i <= n / 2; i++) {
            int tmp = logic(i, d, c) + logic(n - i, d, c);
            if (tmp > d[n]) d[n] = tmp;
        }

        c[n] = true;
        return d[n];
    }
}