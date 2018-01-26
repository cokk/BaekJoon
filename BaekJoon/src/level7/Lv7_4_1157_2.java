package level7;
import java.util.Scanner;

public class Lv7_4_1157_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] apb = new byte['Z' - 'A' + 1];
		String input = sc.nextLine();
		int max=0, place=0, dup=0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) > 'Z') {
				apb[input.charAt(i) - 'a'] += 1;
				if(apb[input.charAt(i)-'a'] == max)
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
			
			//if( max > dup) dup = max;
			//else if(max==dup) dup = input.length()+1;
		}
		
		if(max == dup) System.out.println("?");
		else System.out.println(input.charAt(place));
		sc.close();
	}
}
