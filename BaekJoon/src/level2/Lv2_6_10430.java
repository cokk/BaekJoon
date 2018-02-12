//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10430 : 나머지   
//(A+B)%C는 (A%C + B%C)%C 와 같을까?
//(A×B)%C는 (A%C × B%C)%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
//첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

package level2;
import java.util.Scanner;

public class Lv2_6_10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
	}
}
