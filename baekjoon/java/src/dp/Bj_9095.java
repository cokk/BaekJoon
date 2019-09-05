package dp;

import java.util.Scanner;

public class Bj_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt();
            System.out.println(logic(m));
        }
    }

    public static int logic(int m) {
        int[] d = new int[m + 1];

        if (m == 1) return 1;
        if (m == 2) return 2;
        if (m == 3) return 4;

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i <= m; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        return d[m];
    }
}
