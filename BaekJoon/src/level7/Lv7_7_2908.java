//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2908 : 상수     
//상수는 수를 다른사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면, 
//상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

package level7;
import java.util.Scanner;

public class Lv7_7_2908 {
	static int reverse(int input) { 
		int save = input; 
		input = save/100; 
		input += ((save%100)/10)*10; 
		input += ((save%100)%10)*100;
		return input;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			num[i] = reverse(num[i]);
		}
		System.out.println(num[0] > num[1] ? num[0] : num[1]);
	}
}
