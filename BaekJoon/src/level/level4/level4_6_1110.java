//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1110 : 더하기 사이클 
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
//그 다음, 주어진 수의 가장 오른쪽 자리 숫자와 앞에서 구한 합의 가장 오른쪽 자리 숫자를 이어 붙이면 새로운 수를 만들 수 있다.
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

package level.level4;
import java.util.Scanner;

public class level4_6_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int init,x,y,z,result,count=0;
		
		init = sc.nextInt(); // initial value
		result = init;
		
		while(true){
			x = result/10;
			y = result%10;
			z = x+y;
			result = y*10 + z%10;
			count++;
			if(init == result) break;
		}
		System.out.println(count);
	}
}
