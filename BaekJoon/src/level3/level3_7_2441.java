//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2441 : 별찍기 - 4  
//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.

package level3;
import java.util.Scanner;

public class level3_7_2441 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=n;i>=1;i--){
				for(int j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(int j=i;j>=1;j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
