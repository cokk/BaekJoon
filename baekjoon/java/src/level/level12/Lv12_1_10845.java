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

class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList () {
		head = null;
		tail = null;
		size = 0;
	}

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int input) {
		Node newNode = new Node(input);
		if(head == null){ // add first
			newNode.next = head;
			head = newNode;
		}else if(size == 1){ // second
			head.next = newNode;
			newNode.next = null;
			tail = newNode;
		}else{ // add last
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void pop() {
		// remove first
		if(head != null){
			System.out.println(head.data);
			head = head.next;
			size--;
		}
		else
			System.out.println(-1);
	}

	public void size() {
		System.out.println(size);
	}

	public void empty() {
		if(head == null) 
			System.out.println(1);
		else
			System.out.println(0);
	}

	public void front() {
		if(head == null)
			System.out.println(-1);
		else
			System.out.println(head.data);
	}
	
	public void back() {
		if(head == null)
			System.out.println(-1);
		else if(size == 1)
			System.out.println(head.data);
		else
			System.out.println(tail.data);
	}
}

public class Lv12_1_10845 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LinkedList stack = new LinkedList();
		
		while(num > 0){
			String cmd = sc.next();
			if(cmd.equals("push")){
				int val = sc.nextInt();
				stack.push(val);
			}else if(cmd.equals("pop")){
				stack.pop();
			}else if(cmd.equals("size")){
				stack.size();
			}else if(cmd.equals("empty")){
				stack.empty();
			}else if(cmd.equals("front")){
				stack.front();
			}else if(cmd.equals("back")){
				stack.back();
			}
			num--;
		}	
	}
}
