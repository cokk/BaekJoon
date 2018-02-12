//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10998 : A*B 
//두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.

package level2;
import java.util.Scanner;

public class Lv2_3_10998 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
	}
}
