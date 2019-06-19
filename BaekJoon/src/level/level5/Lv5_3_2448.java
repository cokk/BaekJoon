//미완성 
//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2448 : 별찍기 - 11
//예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.

package level.level5;

import java.util.Scanner;

public class Lv5_3_2448 {
	public static Object starPrint(int num, int d,int k) {
		if (k > 0) { // 재귀 횟수만큼 회전 
			for (int j = 0; j < 3; j++) { // 한 횟수당 3개의 삼각형 
				for (int i = 0; i < d; i++) { // 1 개의 삼각형은 d개의 별로 이루어짐 
					if(i==1 || i==3) System.out.println();
					
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
			return starPrint(num, d*3, k-1);
		}	
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // input = 3*2^k (k<=10)
		//int d = input / 3; // (기본 별 찍는 갯수) = 2^k //8
		int k = (int) (Math.log(8) / Math.log(2)); // 재귀 횟수 //3

		starPrint(input, 8, k);// 24 , 3
	}
}
