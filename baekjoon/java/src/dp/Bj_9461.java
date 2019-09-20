package dp;

import java.util.Scanner;

public class Bj_9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] d = new long[n + 1];
            if (n >= 1) d[1] = 1;
            if (n >= 2) d[2] = 1;
            if (n >= 3) d[3] = 1;
            if (n >= 4) d[4] = 2;
            if (n >= 5) d[5] = 2;
            for (int i = 6; i <= n; i++) {
                d[i] = d[i - 1] + d[i - 5];
            }
            System.out.println(d[n]);
        }
    }
}
