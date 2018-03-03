//Baekjoon Online Judge : https://www.acmicpc.net
//Question 9020 : 골드바흐의 추측   
//골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
//이러한 숫자를 골드바흐 숫자라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 
//예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
//10000보다 작은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
//2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
//만약 가능한 n의 골드바흐 파티션이 여러가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

package level10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv10_5_9020 {
	private static boolean primeNumber(int n){
		Double input = (double)n;
		if(input <= 1) return false;
		
		for(int i=2; i <= Math.sqrt(input); i++){
			if(input % i == 0) return false; 
		}
		return true;
	}
	private static int[] goldbach(int input){
		int[] g= new int[2];
		int half=input/2;
		g[0]=half;
		g[1]=half;
		
		while(true){
			if(primeNumber(half)){
				return g;
			}else if(primeNumber(g[0]) && primeNumber(g[1])){
				return g;
			}else{
				g[0]-=1;
				g[1]+=1;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] g = new int[2];
		
		for(int i=0; i<num; i++){
			int input = Integer.parseInt(br.readLine());
			g=goldbach(input);
			bw.write(g[0]+" "+g[1]+'\n');
			bw.flush();
		}
	}
}
