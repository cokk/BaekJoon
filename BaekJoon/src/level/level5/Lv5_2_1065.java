//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1065 : 한수 
//어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
//등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
//N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

package level.level5;
import java.util.Scanner;

public class Lv5_2_1065 {
	public static int arithSeq(int num) {
		int count=0;
		
		if( num < 100 ) { //1~99
			return num; 
		}
			
		for (int i = 100; i <= num; i++) { //100~999
			int[] save = new int[3];
			save[0] = i/100;
			save[1] = (i%100)/10;
			save[2] = (i%100)%10;
			
			if(save[1]-save[0] == save[2]-save[1])
				count++;
		}
		return count+99;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, input; // ~1000
		input = sc.nextInt();

		System.out.println(arithSeq(input));
	}
}
