//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2439 : 별찍기 - 2  
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.

package level3;

import java.util.Scanner;

public class level3_5_2439 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
