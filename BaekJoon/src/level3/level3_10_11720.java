//Baekjoon Online Judge : https://www.acmicpc.net
//Question 11720 : 숫자의 합 
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

package level3;
import java.util.Scanner;

public class level3_10_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		num = sc.nextInt();
		sc.nextLine();
		String input;
		input = sc.nextLine();
		char[] inChar = input.toCharArray();
		
		if(num>=1 && num<=100){
			for(int i=0;i<num;i++){
				sum += (int)inChar[i]-48;
			}
			System.out.println(sum);
		}
	}
}
