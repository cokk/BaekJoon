package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1912 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n + 1];
        int[] d = new int[n + 1];

        String s = br.readLine();
        String[] split = s.split(" ");
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(split[i - 1]);
            d[i] = a[i];
        }

        d[1] = a[1];
        for (int i = 2; i <= n; i++) {
            if (d[i - 1] + a[i] > d[i]) d[i] = d[i - 1] + a[i];
        }

        int max = d[1];
        for (int i = 2; i <= n; i++) {
            if (d[i] > max) max = d[i];
        }
        System.out.println(max);

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }
}
