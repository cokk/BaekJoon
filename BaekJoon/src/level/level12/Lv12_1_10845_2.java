//Baekjoon Online Judge : https://www.acmicpc.net/problem/10845
//Question 10845 : 큐
//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
/*
명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/

package level.level12;

import java.util.Scanner;

public class Lv12_1_10845_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[10000];
		int front = -1, rear = -1;
		
		while(num>0){
			String cmd = sc.next();
			if(cmd.equals("push")){
				int val = sc.nextInt();
				arr[++rear]=val;
			}else if(cmd.equals("pop")){
				if(front == rear) System.out.println(-1);
				else System.out.println(arr[++front]);
			}else if(cmd.equals("size")){
				System.out.println(rear-front);
			}else if(cmd.equals("empty")){
				if(front == rear) System.out.println(1);
				else System.out.println(0);
			}else if(cmd.equals("front")){
				if(front == rear) System.out.println(-1);
				else System.out.println(arr[front+1]);
			}else if(cmd.equals("back")){
				if(front == rear) System.out.println(-1);
				else System.out.println(arr[rear]);
			}
			num--;
		}
	}
}
