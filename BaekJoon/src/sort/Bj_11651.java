//Baekjoon Online Judge : https://www.acmicpc.net/problem/11651
//Question 11651 : 좌표 정렬하기 2
//2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, 
//y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

//Bubble Sort - 시간 초과 

package sort;

import java.util.Scanner;

public class Bj_11651 {
	public static void swap(int[][] arr, int a, int b){
		int[] s = arr[a];
		arr[a] = arr[b];
		arr[b] = s;
	}
	
	public static void bubbleSort(int[][] arr){
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arr[j][1] > arr[j+1][1]){
					swap(arr, j, j+1);
				} else if(arr[j][1] == arr[j+1][1]){
					// 같을 경우 x좌표 기준 정렬
					if(arr[j][0] > arr[j+1][0]){
						swap(arr, j, j+1);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		bubbleSort(arr);
		
		for(int i=0; i<n; i++){
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
		sc.close();
	}
}
