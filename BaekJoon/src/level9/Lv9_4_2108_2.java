//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2108 : 통계학 
//수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중 앙 값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최 빈 값 : N개의 수들 중 가장 많이 나타나는 값:
//범		위 : N개의 수들 중 최대값과 최소값의 차이
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

package level9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lv9_4_2108_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bp.readLine());
		int[] numbers = new int[num];
		int length = num;
		
		int sum=0;
		for(int i=0; i<length; i++){
			numbers[i] = Integer.parseInt(bp.readLine());
			sum += numbers[i];
		}
		
		Arrays.sort(numbers); 
		
		System.out.println(Math.round((double)sum/length)); 
		
		System.out.println(numbers[num/2]);
		
		int[][] count = new int[length][2];//
		int index=0;
		int priCnt=0, priNum=0;
		for(int i=0; i<length; i++){
			if(i<length-1 && numbers[i] == numbers[i+1]){
				count[index][0] = numbers[i];
				count[index][1] += 1;
			}else{
				count[index][0] = numbers[i]; //value
				count[index][1] += 1; //count
				index++;
			}
			
		}
		
		for(int i=0; i<count.length;i++){
			if(count[i][1] > priCnt){
				priCnt = count[i][1];
				priNum = count[i][0];
			}
		}
		
		int second=0;
		for(int i=0; i<count.length;i++){
			if(count[i][1] == priCnt){
				second += 1;
			}
			if(second == 2){
				priNum = count[i][0];
				break;
			}
		}
		System.out.println(priNum);
		
		System.out.println(numbers[num-1] - numbers[0]);
	}
}
