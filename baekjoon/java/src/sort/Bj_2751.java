package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long start = System.currentTimeMillis();
        int n = Integer.parseInt(br.readLine());
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) l.add(Integer.parseInt(br.readLine()));

        Collections.sort(l);
        for (Integer ll : l) System.out.println(ll);
//        long end = System.currentTimeMillis();
//        System.out.println("실행 시간 : " + (end - start)/1000.0);
    }
}
