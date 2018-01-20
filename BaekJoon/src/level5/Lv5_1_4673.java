//Baekjoon Online Judge : https://www.acmicpc.net
//Question 4673 : 셀프 넘버 
//10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

package level5;

public class Lv5_1_4673 {
	public static int selfNumber(int num) {
		int result, save;
		result = num;
		
		while(num>0){	
			save = num % 10;
			result += save;
			num /= 10;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] num = new int[10000];
		int save;

		for (int i = 1; i <= num.length; i++) {
			save = selfNumber(i); // i=1 , save=2
			if(save < 10000 && save > 0) 
				num[save-1] = save;
		}
		
		for (int i = 0; i < num.length-1; i++) { //0-9999
			if(num[i] == 0)
				System.out.println(i+1);
		}
	}
}
