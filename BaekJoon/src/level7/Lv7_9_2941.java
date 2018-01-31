//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2941 : 크로아티아 알파벳        
//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
//단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

package level7;
import java.util.Scanner;

public class Lv7_9_2941 {
	static int croAlpa(String input){
		int count =0;
		if(input.equals("dz=")) return ++count;
		
		if(input.equals("c=")) count++;
		else if(input.equals("c-")) count++;
		else if(input.equals("d-")) count++;
		else if(input.equals("lj")) count++;
		else if(input.equals("nj")) count++;
		else if(input.equals("s=")) count++;
		else if(input.equals("z=")) count++;
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0, num = 0, result;
		
		for(int i=0;i<input.length()-2;i++){
			count += croAlpa(input.substring(i, i+3)); //3 check
		}
		num += count * 3;
		if(count > 0){
			num -= count * 2;
			count = 0;
		}
		
		for(int i=0;i<input.length()-1;i++){
			count += croAlpa(input.substring(i, i+2)); //2 check
		}
		num += count * 2;
		result = count; //2, 3 count
		count = input.length() - num; // 1 count
		result += count;
		System.out.println(result);
	}
}
