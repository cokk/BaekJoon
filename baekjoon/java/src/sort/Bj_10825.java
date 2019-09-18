package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] sl = new Student[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sl[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(sl, (a, b) -> {
            if (a.k < b.k) return 1;
            else if (a.k == b.k){
                if (a.e > b.e) return 1;
                else if (a.e == b.e){
                    if (a.m < b.m) return 1;
                    else if (a.m == b.m){
                        return a.n.compareTo(b.n);
                    }
                }
            }
            return -1;
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Student s : sl) {
            bw.write(s.n);
            bw.newLine();
        }
        bw.flush();
    }
}

class Student{
    String n;
    int k;
    int e;
    int m;

    public Student(String n, int k, int e, int m) {
        this.n = n;
        this.k = k;
        this.e = e;
        this.m = m;
    }
}