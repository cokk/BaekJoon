//Baekjoon Online Judge : https://www.acmicpc.net
//Question 8393 : 합  
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

package level.level3;
import java.util.Scanner;

public class level3_9_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
		if(input>=1 && input<=10000){
			for(int i=1;i<=input;i++){
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
