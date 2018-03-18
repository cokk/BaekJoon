//Baekjoon Online Judge : https://www.acmicpc.net/problem/1874
//Question 1874 : 스택 수열   
//1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
//이 때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
//임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 
//이를 계산하는 프로그램을 작성하라.

package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class LinkedList3 {
	Node head;
	int size;
	
	LinkedList3() {
		head = null;
		size = 0;
	}
	
	private class Node{
		int data;
		Node next;
		
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void pop(){
		head = head.next;
		size--;
	}
	
	public int peek(){
		return head.data;
	}
	
	public boolean isEmpty(){
		if(size == 0) return true;
		else return false;
	}
	
}

public class Lv11_2_1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int origin = 1,top = 0;
		int[] standard = new int[input];
		LinkedList3 temp = new LinkedList3();
		ArrayList<Character> save = new ArrayList<Character>();
		
		for(int i=0; i<input; i++){
			standard[i] = Integer.parseInt(br.readLine());
		}

		while(true){
			if(standard[top]>origin){ //standard push
				temp.push(origin++);
				save.add('+'); //push
			}else if(standard[top]==origin){
				save.add('+'); //push
				save.add('-'); //pop
				top++;
				origin++;
			}else if(temp.isEmpty() == false && standard[top] == temp.peek()){
				temp.pop();
				top++;
				save.add('-');
			}else {
				top = -1;
				break;
			}
			
			if(top > input-1 && origin > input) break;
		}
		
		if(top == -1) System.out.println("NO");
		else{
			for(int i=0; i< save.size(); i++){
				System.out.println(save.get(i));
			}
		}
	}
}
