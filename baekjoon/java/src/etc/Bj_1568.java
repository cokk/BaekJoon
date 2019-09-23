package etc;

import java.util.Scanner;

public class Bj_1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int k = 1;
        while (n > 0) {
            if (n - k >= 0) {
                n -= k++;
                cnt++;
            } else if (n < k)  {
                k = 1;
            }
        }
        System.out.println(cnt);
    }
}
