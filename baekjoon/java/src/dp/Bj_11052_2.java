package dp;

import java.util.Scanner;

// Bottom-up
public class Bj_11052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
        }

        for (int m = 1; m <= n; m++) {
            for (int i = 1; i <= m; i++) {
                int temp = d[m - i] + d[i];
                if (temp > d[m]) d[m] = temp;
            }
        }

        System.out.println(d[n]);
    }
}
