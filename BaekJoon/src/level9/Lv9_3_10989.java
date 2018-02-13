//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10989 : 수 정렬하기 3
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//카운팅 정렬 또는 기수 정렬로  

package level9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv9_3_10989 {
	private static int[] countSort(int[] num, int max){
		int[] arr = new int[max];
		int N = num.length;
		
		for(int i=0; i<N;i++){
			arr[num[i]-1] += 1;
		}
		
		for(int i=0;i<arr.length-1;i++){
			arr[i+1] += arr[i];
		}
		
		int[] save = new int[N];
		for(int i = num.length-1; i >= 0; i--){
			save[arr[num[i]-1]-1] = num[i];
			arr[num[i]-1] -= 1;
		}
		return save;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bp.readLine());
		int[] num = new int[N];
		int max = 0;
		
		for(int i=0;i<num.length;i++){
			num[i] = Integer.parseInt(bp.readLine());
			if(num[i]>max) max = num[i];
		}
		
		num = countSort(num, max);
		for(int i=0;i<num.length;i++){
			bw.write(num[i]+"\n");
		}
		bw.flush();
	}
}
