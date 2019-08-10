//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1316 : 그룹 단어 체커    
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
//aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다. 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

package level.level7;
import java.util.Scanner;

public class Lv7_5_1316_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		String[] str = new String[input];
		int sum = input;
		
		sc.nextLine();
		for(int i=0; i<input; i++){
			str[i] = sc.nextLine();
			char[] strToChar = str[i].toCharArray();
			byte[] alpa = new byte['z' - 'a' + 1]; // init 0
			int check=0;
			
			for(int j=0;j<strToChar.length; j++){
				if(alpa[strToChar[j]-'a'] == 0) // first check
					alpa[strToChar[j]-'a'] += 1;
				else if(j>0 && alpa[strToChar[j]-'a'] > 0 && strToChar[j] == strToChar[j-1]) // second check
					alpa[strToChar[j]-'a'] += 1;
				else  
					check = -1;
			}
			if(check == -1) sum--;
		}
		System.out.println(sum);
		sc.close();
	}
}
