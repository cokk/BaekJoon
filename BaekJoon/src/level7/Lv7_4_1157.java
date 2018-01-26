//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1157 : 단어 공부  
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
//단, 대문자와 소문자를 구분하지 않는다. 그리고 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

//시간초과 
package level7;
import java.util.Scanner;

public class Lv7_4_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count,index=-1,cntSave=0;
		
		for(int i=0; i<input.length(); i++){
			count = 0;
			for(int j=0; j<input.length(); j++){
				if(input.charAt(i) == input.charAt(j)){
					count++;
					index = j;
				}
			}
			if(count>cntSave) cntSave = count;
			if(count==cntSave) cntSave = input.length()+1;
		}
		
		if(cntSave == input.length()+1)
			System.out.println("?");
		else System.out.println(input.charAt(index));
		
		sc.close();
	}
}
