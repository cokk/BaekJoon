package dp;

import java.util.Scanner;

public class Bj_11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            d[i] = a[i];
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (a[j] < a[i] && d[j] + a[i] > d[i]) d[i] = d[j] + a[i];
            }
            if (d[i] > max) max = d[i];
        }
        System.out.println(max);
    }
}
