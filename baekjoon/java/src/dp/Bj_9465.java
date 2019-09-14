package dp;

import java.util.Scanner;

public class Bj_9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] s = new int[n + 1][2];
            for (int j = 0; j < 2; j++) {
                for (int i = 1; i <= n; i++) {
                    s[i][j] += sc.nextInt();
                }
            }

            int[][] d = new int[n + 1][2];
            d[1][0] = s[1][0];
            d[1][1] = s[1][1];
            for (int i = 2; i <= n; i++) {
                int beforeMax = Math.max(d[i - 2][0], d[i - 2][1]);
                d[i][0] = Math.max(beforeMax + s[i][0], d[i - 1][1] + s[i][0]);
                d[i][1] = Math.max(beforeMax + s[i][1], d[i - 1][0] + s[i][1]);
            }
            System.out.println(Math.max(d[n][0], d[n][1]));
        }
    }
}
