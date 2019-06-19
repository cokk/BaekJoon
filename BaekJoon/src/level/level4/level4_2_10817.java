//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10817 : 세 수    
//세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

package level.level4;
import java.util.Scanner;

public class level4_2_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(A > B){
			if(A >= C){
				if(B >= C)
					System.out.println(B);
				else
					System.out.println(C);
			}else if(A < C){
				System.out.println(A);
			}
		}else if(B >= A){
			if(B >= C){
				if(A >= C)
					System.out.println(A);
				else
					System.out.println(C);
			}else if(B < C){
				System.out.println(B);
			}
		}		
	}
}
