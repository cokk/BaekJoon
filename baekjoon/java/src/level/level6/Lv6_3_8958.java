//Baekjoon Online Judge : https://www.acmicpc.net
//Question 8958 : OX퀴즈
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

package level.level6;
import java.util.Scanner;

public class Lv6_3_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 5
		String[] result = new String[num];
		char[] strToCh = null;
		
		sc.nextLine(); // \n
		for(int i=0;i<result.length;i++){ // result input
			result[i] = sc.nextLine();
		}
		
		for(int i=0;i<result.length;i++){ //0~4
			strToCh = new char[result[i].length()];
			strToCh = result[i].toCharArray(); // String to char[]
			int score = 0;
			int sum = 0;
			for(int j=0;j<result[i].length();j++){ // char arr
				if( j>=1 && strToCh[j-1] == 'X' && strToCh[j] == 'O' ){
					score = 1;
					sum += score;
				}else if(strToCh[j] == 'X'){
					score = 0;
				}
				else{
					score++;
					sum += score;
				}
			}
			System.out.println(sum);
		}
	}
}
