//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10809 : 알파벳 찾기
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
//단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

package level7;
import java.util.Scanner;

public class Lv7_2_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] ch = new char[S.length()];
		ch = S.toCharArray();
		int[] alpa = new int[26];

		alpa[(int) ch[0] - 'a'] = -2; // 0 check
		for (int i = 0; i < ch.length; i++) {
			if (alpa[(int) ch[i] - 'a'] == 0) { // first check
				alpa[(int) ch[i] - 'a'] = i;
			}
		}

		for (int i = 0; i < alpa.length; i++) {
			if (alpa[i] == 0) alpa[i] = -1;
			if (alpa[i] == -2) alpa[i] = 0;
			System.out.print(alpa[i] + " ");
		}
		sc.close();
	}
}