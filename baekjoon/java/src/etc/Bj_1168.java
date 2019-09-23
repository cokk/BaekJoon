package etc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj_1168 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.valueOf(st.nextToken());
        Integer k = Integer.valueOf(st.nextToken());
        for (Integer i = 1; i <= n; i++) q.add(i);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        Integer i = 0;
        while (!q.isEmpty()) {
            Integer value = q.poll();
            i++;

            if (i.compareTo(k) < 0) q.add(value);
            else if (i.equals(k)) {
                bw.write(String.valueOf(value));
                if (!q.isEmpty()) bw.write(", ");
                i = 0;
            }
        }
        bw.write(">");
        bw.flush();
    }
}
