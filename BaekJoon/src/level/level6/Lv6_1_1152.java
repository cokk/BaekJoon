//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1152 : 단어의 개수 
//영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 
//이를 구하는 프로그램을 작성하시오.

package level.level6;
import java.util.Scanner;

public class Lv6_1_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence;
		sentence = sc.nextLine();
		char[] words = sentence.toCharArray();
		int count = 0;
		
		for(int i=0; i<words.length;i++){
			if(i>0)
				if(words[i-1] != ' ' && words[i] == ' ' ){
					count++;
				}else{
					continue;
				}
		}
		if(words[words.length-1] != ' ') count ++;
		System.out.println(count);
	}
}
