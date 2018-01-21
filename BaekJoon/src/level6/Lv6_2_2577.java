//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2577 : 숫자의 개수 
//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

package level6;

import java.util.Scanner;
import java.lang.Character;

public class Lv6_2_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, save, sum = 1, i=0;
		int[] count = new int[10];
		
		for (int k = 0; k < 3; k++) {
			input = sc.nextInt();
			sum *= input;
		}

		save = sum;
		while (save > 0) {
			save /= 10;
			i++;
		}
		
		char[] ch = new char[i];
		
		for(int j=0;j<ch.length;j++){
			int n = sum%10;
			ch[j] = Character.forDigit(n, 10);
			if(n >=0 && n < 10)
				count[n] += 1;
			sum /= 10;
		}
		
		for (int j = 0; j < count.length; j++) {
			System.out.println(count[j]);
		}
	}
}