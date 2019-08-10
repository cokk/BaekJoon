//Baekjoon Online Judge : https://www.acmicpc.net/problem/10866
//Question 10866 : 덱
/*
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여덟 가지이다.
 * push_front X: 정수 X를 덱의 앞에 넣는다.
 * push_back X: 정수 X를 덱의 뒤에 넣는다.
 * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 덱에 들어있는 정수의 개수를 출력한다.
 * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
 * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/

package level.level13;

import java.util.Scanner;

class LinkedList {	
	private class Node{
		private int data;
		private Node right;
		private Node left;
		
		Node(int input){
			this.data = input;
			this.right = null;
			this.left = null;
		}
	}
	private Node head;
	private Node rear;
	private int size;
	
	LinkedList(){
		this.head = null;
		this.rear = null;
		this.size = 0;
	}
	
	public void push_front(int x){
		Node newNode = new Node(x);
		if(head == null || size == 0){
			head = newNode;
			rear = newNode;			
		}else{
			newNode.right = head;
			head.left = newNode;
			head = newNode;
		}
		size++;
	}
	public void push_back(int x){
		Node newNode = new Node(x);
		if(head == null || size == 0){
			head = newNode;
			rear = newNode;
		}else{
			rear.right = newNode;
			newNode.left = rear;
			rear = newNode;
		}
		size++;
	}
	public void pop_front(){
		if(head == null || size == 0){
			System.out.println(-1);
		}else{
			System.out.println(head.data);
			head = head.right;
			size--;
		}
	}
	public void pop_back(){
		if(head == null || size == 0){
			System.out.println(-1);
		}else{
			System.out.println(rear.data);
			rear = rear.left;
			size--;
		}
	}
	public void size(){
		System.out.println(size);
	}
	public void empty(){
		if(size == 0) System.out.println(1);
		else System.out.println(0);
	}
	public void front(){
		if(head == null || size == 0) System.out.println(-1);
		else System.out.println(head.data);
	}
	public void back(){
		if(head == null || size == 0) System.out.println(-1);
		else System.out.println(rear.data);
	}
}

public class Lv13_1_10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), x;
		LinkedList deque = new LinkedList();

		while(num > 0){
			String command = sc.next();
			switch (command) {
			case "push_front":
				x = sc.nextInt();
				deque.push_front(x);
				break;
			case "push_back":
				x = sc.nextInt();
				deque.push_back(x);
				break;
			case "pop_front":
				deque.pop_front();
				break;
			case "pop_back":
				deque.pop_back();
				break;
			case "size":
				deque.size();
				break;
			case "empty":
				deque.empty();
				break;
			case "front":
				deque.front();
				break;
			case "back":
				deque.back();
				break;
			}
			num--;
		}
		sc.close();
	}
}
