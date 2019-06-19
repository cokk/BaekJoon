//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1427 : 소트인사이드   
//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자. 

package level.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv9_5_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		String input = bp.readLine();
		char[] strToChar = input.toCharArray();
		int temp;
		
		for(int i = 1; i<strToChar.length; i++){
			for(int j=i; j>0; j--){
				if((int)strToChar[j] > (int)strToChar[j-1]){
					temp = (int)strToChar[j];
					strToChar[j] = strToChar[j-1];
					strToChar[j-1] = (char)temp;
				}		
			}
		}
		
		for(int i=0; i<strToChar.length; i++){
			System.out.print(strToChar[i]);
		}
	}
}
