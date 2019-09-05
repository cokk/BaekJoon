package dp;

import java.util.Scanner;

public class Bj_9095_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt();
            int[] d = new int[m + 1];
            System.out.println(logic(m, d));
        }
    }

    public static int logic(int m, int[] d) {
        if (m == 1) return 1;
        if (m == 2) return 2;
        if (m == 3) return 4;

        d[m] = logic(m - 1, d) + logic(m - 2, d) + logic(m - 3, d);

        return d[m];
    }
}
