package level.level5;

public class Lv5_3_2448_2 {

	public static void starPrint(int k) {
		String star = 
				  "     *      \n"
				+ "    * *     \n"
				+ "   *****    \n"
				+ "  *     *   \n"
				+ " * *   * *  \n"
				+ "***** ***** \n"; // 12
				
		String starSum = "";
		int length = (int) (6 * Math.pow(2, k)); // 48
		// System.out.println(length);
		// k=3
		for (int j = 0; j <= 3 - k + 1; j++) { //k=3,2,1 / 1, 2, 3 삼각형 찍는 횟수 
			for (int i = 0; i <= k * 3 * 6 * 6; i++) { // 18*6 // 324
				if (i == k * 3 * 6) {// 18
					starSum += "     *      \n";
				} else if (i == k * 3 * 6 * 2) {// 32
					starSum += "    * *     \n";
				} else if (i == k * 3 * 6 * 3) {
					starSum += "   *****    \n";
				} else if (i == k * 3 * 6 * 4) {
					starSum += "  *     *   \n";
				} else if (i == k * 3 * 6 * 5) {
					starSum += " * *   * *  \n";
				} else if (i == k * 3 * 6 * 6) {
					starSum += "***** ***** \n";
				}
				if(i == k * 3 * 6 * 6)
					starSum += "\n";
				
				if(i != k * 3 * 6 * 6) 
					starSum += " "; // 18*6 blank
			}
			if (k > 0)
				starPrint(k - 1);
			else
				return;
		}
		System.out.println(starSum);

	}

	public static void main(String[] args) {
		int k = 3;
		starPrint(k);
	}
}
