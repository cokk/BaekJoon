//Baekjoon Online Judge : https://www.acmicpc.net
//Question 11721 : 열 개씩 끊어 출력하기  
//알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
//한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.

package level3;
import java.util.Scanner;

public class level3_11_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		
		for(int i=0;i<st.length();i++){
			if(i!=0 && i%10 == 0)
				System.out.println();
			System.out.print(ch[i]);
		}
	}
}
