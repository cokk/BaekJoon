//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2440 : 별찍기 - 3   
//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

package level.level3;
import java.util.Scanner;

public class level3_6_2440 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=n;i>0;i--){
				for(int j=i;j>=1;j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
