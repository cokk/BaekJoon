//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1924 : 2007년  
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
//이를 알아내는 프로그램을 작성하시오.

package level3;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class level3_8_1924_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Calendar cal = new GregorianCalendar(2007, x-1, y);
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		
		if(day_of_week==2){
			System.out.println("MON");
		}else if(day_of_week==3){
			System.out.println("TUE");
		}else if(day_of_week==4){
			System.out.println("WED");
		}else if(day_of_week==5){
			System.out.println("THU");
		}else if(day_of_week==6){
			System.out.println("FRI");
		}else if(day_of_week==7){
			System.out.println("SAT");
		}else if(day_of_week==1){
			System.out.println("SUN");
		}
	}
}
