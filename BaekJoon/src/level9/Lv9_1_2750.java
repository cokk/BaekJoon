//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2750 : 수 정렬하기
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//버블 정렬 또는 삽입 정렬로 

package level9;
import java.util.Scanner;

public class Lv9_1_2750 {
	private static int[] BubbleSort(int[] sortArr){
		int swap;
		for(int i=0; i<sortArr.length-1; i++){
			for(int j=0; j<sortArr.length-1; j++){
				if(sortArr[j]>sortArr[j+1]){
					swap = sortArr[j];
					sortArr[j] = sortArr[j+1];
					sortArr[j+1] = swap;
				}
			}
		}
		return sortArr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] sortArr = new int[input];
		
		for(int i=0;i<sortArr.length;i++){
			sortArr[i] = sc.nextInt();
		}
		
		sortArr = BubbleSort(sortArr);
		
		for(int i=0; i<sortArr.length;i++){
			System.out.println(sortArr[i]);
		}
	}
}