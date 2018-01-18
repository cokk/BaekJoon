//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10871 : X 보다 작은 수 
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오. 

package level4;
import java.util.Scanner;

public class level4_3_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X;
		N = sc.nextInt();
		X = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<A.length; i++){
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<A.length; i++){
			if (A[i] < X) 
				System.out.print(A[i]+" ");
		}
	}
}
