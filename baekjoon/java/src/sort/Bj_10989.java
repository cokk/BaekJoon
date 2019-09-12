package sort;

import java.io.*;
import java.util.Arrays;

public class Bj_10989 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] l = new int[n];
        for (int i=0; i<n; i++) {
            l[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(l);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : l) {
            bw.write(Integer.toString(i) + '\n');
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
        br.close();
        bw.close();
    }
}
