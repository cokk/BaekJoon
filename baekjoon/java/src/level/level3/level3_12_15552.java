//Baekjoon Online Judge : https://www.acmicpc.net/problem/15552
//Question 15552 : 빠른 A+B 
/*
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
*/
package level.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class level3_12_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		int a,b;
		
		for(int i=0; i<num; i++){
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}
