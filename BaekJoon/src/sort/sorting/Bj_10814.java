//Baekjoon Online Judge : https://www.acmicpc.net/problem/10814
//Question 10814 : 나이순 정렬 
//온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
//이 때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 
//정렬하는 프로그램을 작성하시오.

//Bubble Sort - 시간초과 

package sort.sorting;

import java.util.Scanner;

public class Bj_10814 {
	public static void swap(String[][] arr, int a, int b){
		String[] s = arr[a];
		arr[a] = arr[b];
		arr[b] = s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] users = new String[n][2];
		
		for(int i=0; i<n; i++){
			users[i][0] = sc.next();
			users[i][1] = sc.nextLine();
		}
		
		for(int i=users.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(Integer.valueOf(users[j][0]) > Integer.valueOf(users[j+1][0])){
					swap(users, j, j+1);
				}
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.println(users[i][0]+" "+users[i][1]);
		}
		
		sc.close();
	}

}
