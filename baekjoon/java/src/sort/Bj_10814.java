package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new Person(i, Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(p, (a, b) -> {
            if (a.a != b.a) return Integer.compare(a.a, b.a);
            else return Integer.compare(a.o, b.o);
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Person pp : p) {
            bw.write(pp.a + " " + pp.n);
            bw.newLine();
        }
        bw.flush();
    }
}

class Person {
    int o;
    int a;
    String n;

    public Person(int o, int a, String n) {
        this.o = o;
        this.a = a;
        this.n = n;
    }
}
