//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2675 : 문자열 반복 
//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
//다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. 
//S에는 QR Code "alphanumeric" 문자만 들어있다.
//QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.

package level.level7;
import java.util.Scanner;

public class Lv7_3_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, r;
		String input, t = "";

		s = sc.nextInt();

		for (int i = 0; i < s; i++) { 
			r = sc.nextInt(); 
			input = sc.next(); 
			for (int j = 0; j < input.length(); j++) {
				for (int k = 0; k < r; k++) { 
					t += input.charAt(j);
				}
			}
			t += '\n';
		}
		System.out.print(t);
	}
}