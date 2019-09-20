package dp;

import java.util.Scanner;

public class Bj_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        d[1] = a[1];
        if (n > 1) d[2] = a[1] + a[2];
        for (int i = 3; i <= n; i++) {
            int a1 = d[i - 2] + a[i];
            int a2 = d[i - 3] + a[i - 1] + a[i];
            d[i] = Math.max(a1, a2);
        }
        System.out.println(d[n]);
    }
}
