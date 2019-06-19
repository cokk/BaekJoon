//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1011 : Fly me to the Alpha Centauri             
//(전략)
//최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다. 
//하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서, 
//이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다. 
//예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 
//사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. 
//( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
//김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 
//하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
//김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최소값을 구하는 프로그램을 작성하라.
//시간초과 

package level.level8;
import java.util.Scanner;

public class Lv8_4_1011_2 {
	private static int lengthCalcul(int kk) {
		int result = 0, i = 0;
		while (kk - i > 0) {
			result += kk - i; //2+1 2+1 3+2+1
			i++;
		}
		return result;
	}

	private static int minOperCnt(int[] input) {
		int length = input[1] - input[0] - 1; //first count
		int count = 1; //first
		int k = 1;

		while (length > 0) {//2
			if (length >= lengthCalcul(k + 1)) {//2
				length -= k + 1;
				k++;
			} else if (length >= lengthCalcul(k)) {
				length -= k;
			} else if (length >= lengthCalcul(k - 1)) {//
				length -= k - 1;
				k--;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] testCase = new int[input][2];
		int[] result = new int[input];

		for (int i = 0; i < testCase.length; i++) {
			for (int j = 0; j < testCase[i].length; j++) {
				testCase[i][j] = sc.nextInt();
			}
			result[i] = minOperCnt(testCase[i]);
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}
}
