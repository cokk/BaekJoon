package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] a = new Integer[n];
        st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            a[i++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a[k - 1]));
        bw.flush();
    }
}
