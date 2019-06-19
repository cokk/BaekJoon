//Baekjoon Online Judge : https://www.acmicpc.net/problem/10825
//Question 10825 :국영수 
//도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 
//이 때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.
//국어 점수가 감소하는 순서로
//국어 점수가 같으면 영어 점수가 증가하는 순서로
//국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
//모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 
//(단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)

//Bubble Sort - 시간 초과 

package sort.sorting;

import java.util.Scanner;

public class Bj_10825 {
	public static void swap(String[][] arr, int a, int b){
		String []s = arr[a];
		arr[a] = arr[b];
		arr[b] = s;
	}
	
	public static void bubbleSort(String[][] arr){
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(Integer.valueOf(arr[j][1]) < Integer.valueOf(arr[j+1][1])){
					// korean
					swap(arr, j, j+1);
				}else if(Integer.valueOf(arr[j][1]) == Integer.valueOf(arr[j+1][1])){
					// English
					if(Integer.valueOf(arr[j][2]) > Integer.valueOf(arr[j+1][2])){
						swap(arr, j, j+1);
					}else if(Integer.valueOf(arr[j][2]) == Integer.valueOf(arr[j+1][2])){
						// math
						if(Integer.valueOf(arr[j][3]) < Integer.valueOf(arr[j+1][3])){
							swap(arr, j, j+1);
						}else if (Integer.valueOf(arr[j][3]) == Integer.valueOf(arr[j+1][3])){
							// ascii
							if(arr[j][0].charAt(0) > arr[j+1][0].charAt(0)){
								swap(arr, j, j+1);
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] students = new String[n][4];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<4; j++){
				students[i][j] = sc.next();
			}
		}
		
		bubbleSort(students);
		
		for(int i=0; i<n; i++){
			System.out.println(students[i][0]);
		}
		sc.close();
	}
}
