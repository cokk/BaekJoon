package level8;
import java.util.Scanner;

public class Lv8_5_10250 {
	private static String HWHotel(int[] info) {
		String roomNum = "";
		int ct = info[2];
		int x = 1;

		while (true) {
			if (ct - info[0] * x > 0)
				x++;
			else
				break;
		}
		int y = ct - info[0] * (x - 1); 

		roomNum = String.valueOf(y);
		if (info[1] >= 10 && x < 10) { // W : 10~99
			roomNum += "0"+String.valueOf(x);
		} else {
			roomNum += String.valueOf(x);
		}
		return roomNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] hotel = new int[num][3]; // height, width, customer
		String[] result = new String[num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				hotel[i][j] = sc.nextInt();
			}
			result[i] = HWHotel(hotel[i]);
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
