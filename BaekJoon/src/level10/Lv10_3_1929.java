//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1929 : 소수 구하기      
//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1≤M≤N≤1,000,000)
//한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedWriter;

public class Lv10_3_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bp.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Boolean> primeList = new ArrayList<Boolean>();

		primeList.add(false); // 0
		primeList.add(false); // 1
		
		for (int i = 2; i <= n; i++) { // 2 ~ n
			primeList.add(true);
		}

		for (int i = 2; i * i <= n; i++) {
			if (primeList.get(i)) {
				for (int j = i*i; j <= n; j += i) {
					primeList.set(j, false);
				}
			}
		}
		
		for (int i=m; i<=n; i++){
			if(primeList.get(i))
				bw.write(i+"\n");
		}
		bw.flush();
	}
}
