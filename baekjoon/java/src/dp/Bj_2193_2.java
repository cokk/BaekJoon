package dp;

import java.util.Scanner;

public class Bj_2193_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n + 1];

        System.out.println(logic(n, d));
    }
    public static long logic(int m, long[] d) {
        if (m == 1) return 1;
        if (m == 2) return 1;

        if (d[m] != 0) return d[m];
        else d[m] = logic(m - 2, d) + logic(m - 1, d);

        return d[m];
    }
}
