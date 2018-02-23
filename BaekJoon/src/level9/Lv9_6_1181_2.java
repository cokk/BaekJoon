//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1181 : 단어정렬    
//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//길이가 짧은 것부터 길이가 같으면 사전 순으로
//첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//주어지는 문자열의 길이는 50을 넘지 않는다.
//조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lv9_6_1181_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bp.readLine());
		String[] words = new String[input];
		String temp;

		for (int i = 0; i < input; i++) {
			words[i] = bp.readLine();
		}
		
		Arrays.sort(words);
		
		for (int i = 1; i < input; i++) {
			for (int j = i; j > 0; j--) {
				if (words[j - 1].length() > words[j].length()) { // 길이순 정렬
					temp = words[j - 1];
					words[j - 1] = words[j];
					words[j] = temp;
				} 
			}
		}
		
		ArrayList<String> words2 = new ArrayList<String>();
		
		words2.add(0, words[0]);
		for (int i = 1; i < input; i++) {
			if (!words[i - 1].equals(words[i])) {
				words2.add(words[i]);
			}
		}
		
		Iterator<String> it = words2.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
