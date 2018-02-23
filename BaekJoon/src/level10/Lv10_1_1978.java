package level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lv10_1_1978 {
// 수정 해야함. 
	private static int primeNumber(String n){
		int input = Integer.parseInt(n);
		if(input <= 1) return 0;
		
		ArrayList<Boolean> primeList = new ArrayList<Boolean>();
		primeList.add(false); // 0
		primeList.add(false); // 1
		
		for(int i=2; i <= input; i++){ // 2 ~ n 
			primeList.add(true); 
		}
		
		for(int i=2; i*i <= input; i++){
			if(primeList.get(i)){
				for(int j=i; j<= input; j+=i){
					primeList.add(j, false);
				}
			}
		}
		
		
		return input;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bp.readLine());
		StringTokenizer st = new StringTokenizer(bp.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		
		for(int i=0; i<n; i++){
			count += primeNumber(st.nextToken());
		}
		
		bw.write(count+"\n");
		bw.flush();
	}
}
