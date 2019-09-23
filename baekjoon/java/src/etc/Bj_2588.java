package etc;

import java.util.Scanner;

public class Bj_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int[] r = new int[b.length()];

        int sum = 0;
        for (int i = 0; i < b.length(); i++) {
            Integer v = Integer.valueOf(b.substring(i, i+1));
            r[i] = a * v;
            sum += r[i] * Math.pow(10, Math.abs(i + 1 - b.length()));
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            System.out.println(r[i]);
        }

        System.out.println(sum);
    }
}
