//Baekjoon Online Judge : https://www.acmicpc.net/problem/1260
//Question 1260 : DFS와 BFS
/*
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
*/
package level.level12;
import java.util.Scanner;
import java.util.ArrayList;

public class Lv12_2_1260 {
	public static void dfs(ArrayList<Integer>[] a, int v, boolean[] c){
		int n = a[v].size();
		
		System.out.print(v+" ");
		c[v] = false; // visit check
		
		for(int i=0; i<n; i++){
			if(a[v].get(i)!=null && c[a[v].get(i)])
				dfs(a,a[v].get(i),c);
		}
	}
/*	
	public static void bfs(ArrayList<Integer>[] a, int v, boolean[] c){
		Queue<Integer> q = new LinkedList<Integer>();
		int n = a.length-1; //4
		
		q.add(v);
		c[v] = true;
		
		while(!q.isEmpty()){
			v= q.poll(); // 1
			System.out.print(v+" ");
			
			for(int i=1; i<n; i++){
				
			}
		}
		
		for(int i=1; i<=n; i++){
			int m = a[v].size();
			for(int j=0; j<m; j++){
				if(a[v][j] != null && c[a[v][j]]) 
			}
		}
	}
*/	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //정점의 갯수 
		int m = sc.nextInt(); //간선의 갯수
		int v = sc.nextInt(); //탐색을 시작할 정점의 번호
		//int[][] arr = new int[M][M];
		boolean[] c1 = new boolean[n+1];// 0은 제외 , default = false; 방문 하면 true
		//boolean[] c2 = new boolean[n+1];
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
		
		for(int i=0; i<= n; i++){
			a[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++){
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			
			c1[v1] = true;
			c1[v2] = true;
			
			a[v1].add(v2);
			a[v2].add(v1);
		}
		//System.arraycopy(c1, 0, c2, 0, a.length); // deep copy
		
		System.out.print("dfs:");
		dfs(a,v,c1);
		System.out.println();
		/*
		System.out.print("bfs:");
		bfs(a,v,c1);
		System.out.println();
		*/
	}
}
