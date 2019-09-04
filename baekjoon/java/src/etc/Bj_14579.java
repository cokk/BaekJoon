package etc;

import java.math.BigInteger;
import java.util.Scanner;

public class Bj_14579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger result = new BigInteger("1");

        for (int i = a; i <= b; i++) {
            result = result.multiply(logic(i));
        }

        System.out.println(result.remainder(new BigInteger("14579")).toString());
    }

    public static BigInteger logic(int n) {
        int q = n / 2;
        if (n % 2 == 0) {
            return BigInteger.valueOf((1 + n) * q);
        } else {
            return BigInteger.valueOf((n * q) + n);
        }
    }
}
