package dp;

import java.util.Scanner;

public class Bj_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        int[] s = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
        }

        d[1] = s[1];
        if (n > 1) d[2] = s[1] + s[2];
        for (int i = 3; i <= n; i++) {
            int s0 = d[i - 1];
            int s1 = d[i - 2] + s[i];
            int s2 = d[i - 3] + s[i] + s[i - 1];
            d[i] = Math.max(s0, Math.max(s1, s2));
        }
        System.out.println(d[n]);
    }
}
