//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2581 : 소수
//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 프로그램을 작성하시오.
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
//이들 소수의 합은 620이고, 최소값은 61이 된다.

package level.level10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv10_2_2581 {
	private static boolean primeNumber(int n){
		Double input = (double)n;
		if(input <= 1) return false;
		
		for(int i=2; i <= Math.sqrt(input); i++){
			if(input % i == 0) return false; 
		}
		
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(bp.readLine());
		int n = Integer.parseInt(bp.readLine());
		int sum=0, min=0;
		
		for(int i=m;i<=n;i++){
			if(primeNumber(i)) {
				if(min == 0) min = i;
				sum += i;
			}
		}
		
		if(sum == 0 && min == 0){
			bw.write("-1");
			bw.flush();
		}else{
			bw.write(sum+"\n");
			bw.write(min+"\n");
			bw.flush();
		}
	}
}
