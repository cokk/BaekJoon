package dp;

import java.util.Scanner;

public class Bj_11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] d = new int[n + 1];
        int[] r = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            d[i] = 1;
            r[i] = 1;
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (a[j] < a[i] && d[j] + 1 > d[i])
                    d[i] = d[j] + 1;
            }
        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                if (a[i] > a[j] && r[j] + 1 > r[i])
                    r[i] = r[j] + 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            int v = d[i] + r[i] - 1;
            if (v > max) max = v;
        }
        System.out.println(max);
    }
}
