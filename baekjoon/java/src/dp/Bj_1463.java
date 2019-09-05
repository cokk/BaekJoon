package dp;

import java.util.Scanner;

public class Bj_1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];

        d[1] = 0;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1] + 1;
            if (i % 3 == 0) {
                int tmp = d[i/3] + 1;
                if (d[i] > tmp) d[i] = tmp;
            } else if (i % 2 == 0) {
                int tmp = d[i/2] + 1;
                if (d[i] > tmp) d[i] = tmp;
            }
        }

        System.out.println(d[n]);
    }
}
