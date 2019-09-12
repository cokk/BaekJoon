package sort;

import java.io.*;
import java.util.*;

public class Bj_1181 {
    public static void main(String[] args) throws IOException{
        List<String> l = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            l.add(br.readLine());
        }

        Collections.sort(l, (o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;

            for (int i=0; i<o1.length(); i++) {
                char c1 = o1.charAt(i);
                char c2 = o2.charAt(i);
                if (c1 != c2) return c1 - c2;
            }

            return o1.charAt(0) - o2.charAt(0);
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.flush();
        String before = l.get(0);
        bw.write(before + '\n');
        for (int i=1; i<l.size(); i++) {
            String str = l.get(i);
            if (!before.equals(str)) {
                bw.write(str);
                bw.newLine();
                before = str;
            }
        }

        br.close();
        bw.close();
    }
}
