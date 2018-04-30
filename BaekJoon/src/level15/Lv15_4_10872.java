//Baekjoon Online Judge : https://www.acmicpc.net/problem/10872
//Question 10872 : 팩토리얼
/*
 * 0보다 크거나 같은 정수 N이 주어진다. 이 때, N!을 출력하는 프로그램을 작성하시오.
 */

package level15;

import java.util.Scanner;

public class Lv15_4_10872 {
	static int factorial(int num){
		if(num == 0) return num;
		else if(num == 1) return num;
		else return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==0) System.out.println(1);
		else System.out.println(factorial(num));
	}

}
