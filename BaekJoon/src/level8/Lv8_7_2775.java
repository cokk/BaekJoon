//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2775 : 부녀회장이 될테야             
//평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
//이 아파트에 거주를 하려면 조건이 있는데, “a 층의 b 호에 살려면 자신의 아래(a-1)층에 1호부터 b 호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
//아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정 했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있나를 출력하라. 
//단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층에 i호에는 i명이 산다.

package level8;
import java.util.Scanner;

public class Lv8_6_2775 {
	private static int houseRules(int layer, int room, int people){
		if(layer == 1){
			people = 0;
			for(int i=1;i<=room;i++){
				people += i; 
			}
			return people; 
		}
		else{
			people = 0;
			for(int i=1;i<=room;i++){
				people += houseRules(layer-1,i,people);
			}
			return people;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] house = new int[num][2];
		
		for(int i=0; i<house.length;i++){
			for(int j=0; j<house[i].length; j++){
				house[i][j] = sc.nextInt();
			}
			System.out.println(houseRules(house[i][0],house[i][1],0));
		}
		sc.close();
	}
}
