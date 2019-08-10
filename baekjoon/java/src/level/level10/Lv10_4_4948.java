//Baekjoon Online Judge : https://www.acmicpc.net
//Question 4948 : 베르트랑 공준 
//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

package level.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv10_4_4948 {
	private static int primeNum(int input) throws IOException{
		int n = input;
		int m = input * 2;
		int num = 0;
		boolean[] primeNumArr = new boolean[m+1]; 
		
		if(input == 0) return 0;
		
		for(int i=2; i<=m; i++) primeNumArr[i] = true;
		
		for(long i=2; i<=m; i++){
			if(primeNumArr[(int) i] == true){
				for(long j=i*i; j<=m; j+=i){
					primeNumArr[(int) j] = false;
				}
			}
		}
		
		for(int i=n+1; i <= m; i++){ 
			if(primeNumArr[i] == true) num++;
		}
		return num;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		int input;
		
		do{
			input = Integer.parseInt(bp.readLine());
			input = primeNum(input);
			if(input != 0) System.out.println(input);
		}while(input != 0);
	}
}
