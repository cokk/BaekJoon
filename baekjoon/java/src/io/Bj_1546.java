package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] s = new double[n + 1];
        double m = 0;
        int i = 1;
        while (st.hasMoreTokens()) {
            s[i] = Integer.parseInt(st.nextToken());
            if (s[i] > m) m = s[i];
            i++;
        }

        double sum = 0;
        for (int j = 1; j <= n; j++) {
            s[j] = (s[j] / m) * 100;
            sum += s[j];
        }
        System.out.println(sum / n);
    }
}
