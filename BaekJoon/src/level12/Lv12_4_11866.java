//Baekjoon Online Judge : https://www.acmicpc.net/problem/11866
//Question 11866 : 조세퍼스 문제 0
/*
조세퍼스 문제는 다음과 같다.
1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 
이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 
예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.
 */

package level12;

import java.util.Scanner;

class LinkedList3_2{
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList3_2(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			head.next = tail;
		}else if(size == 1){
			head.next = newNode;
			tail = newNode;
			tail.next = head;
		}else{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		size++;
	}
	
	public int pop(int num){
		Node searchNode = head, preNode = null, nextNode;
		if(num == 1){
			preNode = tail;
			nextNode = searchNode.next;
			preNode.next = nextNode;
			head = nextNode;
			tail = preNode;
			
		}else{
			for(int i=0; i<num-1; i++){
				preNode = searchNode;
				searchNode = searchNode.next;
			}
		
			nextNode = searchNode.next;
			preNode.next = nextNode;
			head = nextNode;
			tail = preNode;
		}
		size--;
		return searchNode.data;
	}
	
	public int size(){
		return size;
	}
}

public class Lv12_4_11866 {
	public static void main(String[] args) {
		LinkedList3_2 jp = new LinkedList3_2();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), save;
		
		for(int i=1; i<=num; i++) jp.push(i);
		
		num = sc.nextInt();
		System.out.print("<");
		while(true){
			if(jp.size() == 0) break;
			
			save = jp.pop(num);
			System.out.print(save);
			if(jp.size() != 0) System.out.print(", ");
		}
		System.out.println(">");
		sc.close();
	}
}
