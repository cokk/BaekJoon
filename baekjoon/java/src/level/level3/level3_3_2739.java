//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2739 : 구구단  
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

package level.level3;
import java.util.Scanner;

public class level3_3_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		if (n > 0 && n < 10) {
			for(int i=1;i<10;i++){
				System.out.printf("%d * %d = %d\n",n,i,n*i);
			}
		}
	}
}
