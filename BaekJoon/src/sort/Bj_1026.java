//Baekjoon Online Judge : https://www.acmicpc.net/problem/1026
//Question 1026 : 보물
//옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
//길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
//S = A[0]*B[0] + ... + A[N-1]*B[N-1]
//S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다.
//S의 최솟값을 출력하는 프로그램을 작성하시오.

//Selection Sort

package sort;

import java.util.Scanner;

public class Bj_1026 {
	public static int minIndex(int[] a, int i){
		int min = a[i];
		int index=i;
		
		for(;i<a.length; i++){
			if(min>a[i]){
				min = a[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static int maxIndex(int[] b, int i){
		int max = b[i];
		int index=i;
		
		for(;i<b.length;i++){
			if(max<b[i]){
				max=b[i];
				index=i;
			}
		}
		return index;
	}
	
	public static void swap(int[] arr, int a, int b){
		int s=arr[a];
		arr[a]=arr[b];
		arr[b]=s;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			b[i] = sc.nextInt();
		}
		
		int sum=0;
		int m,x;
		
		for(int i=0; i<n; i++)
		{
			m = minIndex(a,i);
			x = maxIndex(b,i);
			sum += a[m]*b[x];
			
			swap(a, m, i);
			swap(b, x, i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
