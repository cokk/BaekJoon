package sort;

import java.util.*;

public class Bj_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("");
        List<Integer> l = new ArrayList<>();

        for (String sp : split) {
            l.add(Integer.valueOf(sp));
        }
        Arrays.sort(split, Collections.reverseOrder());

        for (String sp : split) {
            System.out.print(sp);
        }
    }
}
