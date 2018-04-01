//Baekjoon Online Judge : https://www.acmicpc.net/problem/1021
//Question 1021 : 회전하는 큐 
/*
 * 지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.
 * 지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
 * 첫번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
 * 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
 * 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
 * 큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.) 
 * 이 때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
 */
package level13;

import java.util.Scanner;

class LinkedList2 {
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
	
	LinkedList2(){
		this.head = null;
		this.rear = null;
		this.size = 0;
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			rear = newNode;
		}else{
			rear.right = newNode;
			newNode.left = rear;
			rear = newNode;
			rear.right = head;
			head.left = rear;
		}
		size++;
	}
	
	public void pop(){
		if(head == null || size == 0){
			System.out.println("empty");
		}else if(size == 1){
			head = head.right;
			rear = rear.left;
			size--;
		}else{
			head = head.right;
			head.left = rear;
			rear.right = head;
			size--;
		}
	}
	
	public void rightMove(){
		head = head.left;
		rear = rear.left;
	}
	
	public void leftMove(){
		head = head.right;
		rear = rear.right;
	}
	
	public int front(){
		return head.data;
	}
	
	public int end(){
		return rear.data;
	}
	
	public int size(){
		return size;
	}
	
	public int searchIndex(int num){
		int index=0;
		Node searchNode = head;
		for(int i=0; i<size; i++){
			if(searchNode.data == num){
				index = i;
				break;
			}else{
				searchNode = searchNode.right;
			}
		}
		return index;
	}
}

public class Lv13_2_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), count = 0;
		LinkedList2 q = new LinkedList2();
		
		for(int i=1; i<=input; i++){
			q.push(i);
		}
		
		input = sc.nextInt();
		int[] save = new int[input];
		for(int i=0; i<input; i++){
			save[i] = sc.nextInt();
		}
		
		int i=0,index=0;
		while(i < input){
			index = q.searchIndex(save[i]);
			
			if(q.front() == save[i]){
				q.pop();
				i++;
			}else{
				if(index <= Math.abs(q.size()-index-1)){ // left, =
					q.leftMove();
				}else{ // right
					q.rightMove();
				}
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
