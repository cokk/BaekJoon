//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1193 : 분수찾기           
//무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
//이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 순서로 
//차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

package level8;
import java.util.Scanner;

public class Lv8_3_1193 {
	private static String findFountain(int input) {
		int i = 0,top = 0,bottom = 0;
		while (input > 0) { // line count
			i++;
			input -= i;
		}
		input += i;
		if (i % 2 == 1){
			top = i - input + 1;
			bottom = input;
		}
		else if (i % 2 == 0){
			top = input;
			bottom = i - input + 1;
		}
		return String.valueOf(top)+"/"+String.valueOf(bottom); 
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(findFountain(input));
	}
}
