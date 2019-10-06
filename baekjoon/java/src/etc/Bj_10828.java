package etc;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj_10828 {
    public static void main(String[] args) throws IOException {
        Stack<String> stk = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.charAt(0) == 'p') {
                if (st.hasMoreTokens()) stk.push(st.nextToken());
                else {
                    if (stk.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(stk.pop() + "\n");
                }
            } else if (s.charAt(0) == 's') {
                bw.write(stk.size() + "\n");
            } else if (s.charAt(0) == 'e') {
                if (stk.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            } else if (s.charAt(0) == 't') {
                if (!stk.isEmpty()) bw.write(stk.peek() + "\n");
                else bw.write(-1 + "\n");
            }
        }
        bw.flush();
    }
}
