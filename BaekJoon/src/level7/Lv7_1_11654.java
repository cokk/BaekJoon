//Baekjoon Online Judge : https://www.acmicpc.net
//Question 11654 : 아스키 코드   
//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

package level7;
import java.util.Scanner;

public class Lv7_1_11654 {
	public static void main(String[] args) {
		char input;
		Scanner sc = new Scanner(System.in);
		input = sc.next().charAt(0); // scanner input char
		System.out.println((int)input);
		sc.close();
	}
}
