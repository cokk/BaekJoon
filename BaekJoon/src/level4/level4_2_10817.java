//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10817 : 세 수    
//세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
//미

package level4;
import java.util.Scanner;

public class level4_2_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int Max = 0, secondMax = 0, count = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] < 1 || num[i] > 100)
				System.exit(0);
		}

		for (int i = 0; i < num.length; i++) {
				if (num[i] >= Max)
					Max = num[i];
		}

		for (int i = 0; i < num.length; i++) {
			if (count < 2 && num[i] < Max && num[i] >= secondMax){
				secondMax = num[i];
				count++;
			} 
		}
		if(count == 0)
			secondMax = Max;
		
		System.out.println(secondMax);
	}
}
