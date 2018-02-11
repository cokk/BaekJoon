//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1475 : 방 번호              
//다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
//다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
//다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오. 
//(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

package level8;
import java.util.Scanner;

public class Lv8_8_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] num = new int[9]; //0~8 , 6 is equal to 9
		int max = 0;
		
		if(input == 0) num[0] += 1;
		
		while(input > 0){
			if(input%10 == 6 || input%10 == 9) num[6] += 1; 
			else if(input % 10 == 0) num[0] += 1;
			else num[input % 10] += 1;
			input /= 10;
		}
		
		if(num[6]>0){
			if(num[6] % 2 != 0) num[6] = num[6]/2+1;
			else num[6] = num[6]/2;
		}
		
		for(int i=0; i<num.length;i++){ // 0~8
			if(num[i] > max) max = num[i];
		}
		System.out.println(max);
		sc.close();
	}
}