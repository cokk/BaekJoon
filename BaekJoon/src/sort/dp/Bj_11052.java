/**
 * 카드 구매하기 : https://www.acmicpc.net/problem/11052
 *
 * 요즘 민규네 동네에서는 스타트링크에서 만든 PS카드를 모으는 것이 유행이다.
 *
 * PS카드는 PS(Problem Solving)분야에서 유명한 사람들의 아이디와 얼굴이 적혀있는 카드이다. 각각의 카드에는 등급을 나타내는 색이 칠해져 있고, 다음과 같이 8가지가 있다.
 *
 * 전설카드
 * 레드카드
 * 오렌지카드
 * 퍼플카드
 * 블루카드
 * 청록카드
 * 그린카드
 * 그레이카드
 * 카드는 카드팩의 형태로만 구매할 수 있고, 카드팩의 종류는 카드 1개가 포함된 카드팩, 카드 2개가 포함된 카드팩, ... 카드 N개가 포함된 카드팩과 같이 총 N가지가 존재한다.
 * 민규는 카드의 개수가 적은 팩이더라도 가격이 비싸면 높은 등급의 카드가 많이 들어있을 것이라는 미신을 믿고 있다. 따라서, 민규는 돈을 최대한 많이 지불해서 카드 N개 구매하려고 한다. 카드가 i개 포함된 카드팩의 가격은 Pi원이다.
 * 예를 들어, 카드팩이 총 4가지 종류가 있고, P1 = 1, P2 = 5, P3 = 6, P4 = 7인 경우에 민규가 카드 4개를 갖기 위해 지불해야 하는 금액의 최댓값은 10원이다. 2개 들어있는 카드팩을 2번 사면 된다.
 * P1 = 5, P2 = 2, P3 = 8, P4 = 10인 경우에는 카드가 1개 들어있는 카드팩을 4번 사면 20원이고, 이 경우가 민규가 지불해야 하는 금액의 최댓값이다.
 * 마지막으로, P1 = 3, P2 = 5, P3 = 15, P4 = 16인 경우에는 3개 들어있는 카드팩과 1개 들어있는 카드팩을 구매해 18원을 지불하는 것이 최댓값이다.
 * 카드 팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최댓값을 구하는 프로그램을 작성하시오. N개보다 많은 개수의 카드를 산 다음, 나머지 카드를 버려서 N개를 만드는 것은 불가능하다. 즉, 구매한 카드팩에 포함되어 있는 카드 개수의 합은 N과 같아야 한다.
 */
package sort.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_11052 {
//    private static final int N = 4;
//    private static final int[] p = {1, 5, 6, 7}; // result 10
//    private static final int N = 5;
//    private static final int[] p = {10, 9, 8, 7, 6}; // result 50
//    private static final int N = 10;
//    private static final int[] p = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}; // result 55
//    private static final int N = 10;
//    private static final int[] p = {5, 10, 11, 12, 13, 30, 35, 40, 45, 47}; // result 50
//    private static final int N = 4;
//    private static final int[] p = {5, 2, 8, 10}; // result 20
//    private static int[] save = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        Integer[] p = new Integer[n];
        Integer[] save = new Integer[n];

        int i = 0;
        for(String s : in.readLine().split(" ")){
            p[i] = Integer.parseInt(s);
            i++;
        }
        System.out.println(solution1(n, p, save));
    }

    // 시간 초과
    public static int solution1(Integer n, Integer[] p, Integer[] save) {
        int max = Integer.MIN_VALUE;
        save[0] = p[0];
        if(n == 1) return save[0];
        if(save[n-1] != null) return save[n-1];

        for(int i=0; i<n; i++) {
            int value = i + 1;
            if(n % value == 0) {
                int temp = (n / value) * p[i];
                if(temp > max) max = temp;
            } else {
                int q = n / value;
                int temp = q * p[i] + solution1(n - (value * q), p, save);
                if(temp > max) max = temp;
            }
        }
        return max;
    }

}
