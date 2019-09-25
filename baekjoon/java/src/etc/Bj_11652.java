package etc;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bj_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> m = new HashMap<>();

        while (n-- > 0) {
            Long c = Long.parseLong(br.readLine());
            if (!m.containsKey(c)) m.put(c, 1);
            else {
                Integer v = m.get(c);
                m.put(c, ++v);
            }
        }

        Map.Entry<Long, Integer> me = null;
        for (Map.Entry<Long, Integer> e : m.entrySet()) {
            if (me == null || e.getValue().compareTo(me.getValue()) > 0) me = e;
            else if (e.getValue().equals(me.getValue()) && e.getKey().compareTo(me.getKey()) < 0) me = e;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(me.getKey().toString());
        bw.flush();
    }
}
