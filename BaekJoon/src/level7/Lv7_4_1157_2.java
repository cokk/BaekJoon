//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1157 : 단어 공부  
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
//단, 대문자와 소문자를 구분하지 않는다. 
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
//그리고 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

package level7;
import java.util.Scanner;

public class Lv7_4_1157_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] apb = new int['Z' - 'A' + 1];
		String input = sc.nextLine();
		int max=0, place=0, dup=0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) > 'Z') {
				apb[input.charAt(i) - 'a'] += 1;
				if(apb[input.charAt(i) - 'a'] == max)
					dup = max;
				if(apb[input.charAt(i)-'a']>max){
					max = apb[input.charAt(i)-'a'];
					place = i;
				}
			} else {
				apb[input.charAt(i) - 'A'] += 1;
				if(apb[input.charAt(i)-'A'] == max)
					dup = max;
				if(apb[input.charAt(i)-'A']>max){
					max = apb[input.charAt(i)-'A'];
					place = i;
				}
			}
		}
		if(max == dup) System.out.println("?");
		else if(input.charAt(place) > 'Z') 
			System.out.println((char)(input.charAt(place)-('a'-'A')));
		else 
			System.out.println(input.charAt(place));
		sc.close();
	}
}
