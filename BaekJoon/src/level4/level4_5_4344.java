//Baekjoon Online Judge : https://www.acmicpc.net
//Question 4344 : 평균은 넘겠지 
//첫째 줄에는 테스트케이스 C가 주어진다.
//둘째 줄부터 각 테스트케이스 마다 첫 수로 정수 N(1 <= N <= 1000)명의 학생이 주어지고 
//그 다음으로 N명의 0부터 100 사이의 점수가 이어서 주어진다.
//각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째자리에서 반올림하여 출력한다.

package level4;
import java.util.Scanner;

public class level4_5_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = null;
		int x,y,count=0;
		x = sc.nextInt(); // 1
		arr = new int[x][];
		float[] avg = new float[x]; // average save
		
		for(int i=0; i<arr.length; i++){
			y = sc.nextInt(); // 2
			arr[i] = new int[y];
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt(); // 2 value
				avg[i] += arr[i][j]; // sum
			}
		}
		
		for(int i=0; i<arr.length; i++){
			avg[i] = avg[i]/(float)arr[i].length; // average
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] > avg[i]) count++; // average count
			}
			System.out.printf("%.3f", ((float)count/arr[i].length)*100); 
			System.out.print("%\n");
			count = 0;
		}
	}
}
