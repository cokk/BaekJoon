//Baekjoon Online Judge : https://www.acmicpc.net
//Question 10828 : 스택  
//정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 다섯 가지이다.
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

package level.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList () {
		head = null;
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
		// add first
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		
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

	public void top() {
		if(head == null)
			System.out.println(-1);
		else
			System.out.println(head.data);
	}
}

public class Lv11_1_10828 {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		LinkedList stack = new LinkedList();

		while (num > 0) {
			String input = br.readLine();
			String[] inputSpt = input.split(" ");

			if (inputSpt[0].equals("push")) {
				stack.push(Integer.parseInt(inputSpt[1]));
			} else if (inputSpt[0].equals("pop")) {
				stack.pop();
			} else if (inputSpt[0].equals("size")) {
				stack.size();
			} else if (inputSpt[0].equals("empty")) {
				stack.empty();
			} else if (inputSpt[0].equals("top")) {
				stack.top();
			}
			num--;
		}
	}
}
