//Baekjoon Online Judge : https://www.acmicpc.net/problem/11650
//Question 11650 : 좌표 정렬하기
//2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, 
//x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
//(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

//선택 정렬로 풀이 시 시간초과, 퀵 정렬로 풀어야 함.

package selectionSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_11650 {
	public static int minIndex(int[][] a, int i){
		int min = a[i][0];
		int minIndex = i;
		
		for(;i<a.length;i++){
			if(min>a[i][0]){
				min=a[i][0];
				minIndex = i;
			}else if(min==a[i][0]){
				if(a[minIndex][1]>a[i][1]){
					minIndex = i;
				}
			}
		}
		
		return minIndex;
	}
	
	public static void swap(int[][] arr, int m, int i){
		int[] s = arr[m];
		arr[m] = arr[i];
		arr[i] = s;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int m;
		String input;
		String[] inputs;
		
		for(int i=0;i<n;i++){
			input = br.readLine();
			inputs = input.split(" ");
			arr[i][0] = Integer.parseInt(inputs[0]);
			arr[i][1] = Integer.parseInt(inputs[1]);
		}
		
		for(int i=0; i<n; i++){
			m = minIndex(arr, i);
			swap(arr, m, i);
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}
