package level4;
import java.util.Scanner;

public class level4_2_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int Max = 0, secondMax = 0, count = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] < 1 || num[i] > 100)
				System.exit(0);
		}
		// scan 2 || scan 1 , mem 1
		for (int i = 0; i < num.length; i++) {
				if (num[i] >= Max)
					Max = num[i];
		}

		for (int i = 0; i < num.length; i++) {
			if (count < 2 && num[i] < Max && num[i] >= secondMax){
				secondMax = num[i];
				count++;
			} 
		}
		if(count == 0)
			secondMax = Max;
		
		System.out.println(secondMax);
	}
}
