//Baekjoon Online Judge : https://www.acmicpc.net/problem/2902
//Question 2902 : KMP는 왜 KMP일까?
/*
 * KMP 알고리즘이 KMP인 이유는 이를 만든 사람의 성이 Knuth, Morris, Prett이기 때문이다. 
 * 이렇게 알고리즘에는 발견한 사람의 성을 따서 이름을 붙이는 경우가 많다.
 * 또 다른 예로, 유명한 비대칭 암호화 알고리즘 RSA는 이를 만든 사람의 이름이 Rivest, Shamir, Adleman이다.
 * 사람들은 이렇게 사람 성이 들어간 알고리즘을 두 가지 형태로 부른다.
 * 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 
 * 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태라고 부른다.
 * 두 번째로 짧은 형태는 만든 사람의 성의 첫글자만 따서 부르는 것이다. 예를 들면, KMP이다.
 * 긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램을 작성하시오.
 */

package level27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv27_1_2902 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] split = input.split("-");
		
		for(int i=0; i<split.length; i++){
			bw.write(split[i].charAt(0));
		}
		bw.write("\n");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
