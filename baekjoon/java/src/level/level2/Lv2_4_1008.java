//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1008 : A/B 
//A/B를 계산하시오.
//첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10^-9 까지 허용한다.

package level.level2;
import java.util.Scanner;

public class Lv2_4_1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = a/b;
		
		System.out.println(result);
	}
}
