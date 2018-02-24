//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1978 : 소수 찾기 
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

package level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Lv10_1_1978 {
	private static int primeNumber(String n){
		Double input = Double.parseDouble(n);
		if(input <= 1) return 0;
		
		for(int i=2; i <= Math.sqrt(input); i++){
			if(input % i == 0) return 0; 
		}
		
		return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bp.readLine());
		StringTokenizer st = new StringTokenizer(bp.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		
		for(int i=0; i<n; i++){
			count += primeNumber(st.nextToken());
		}
		
		bw.write(count+"\n");
		bw.flush();
	}
}
