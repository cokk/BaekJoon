//Baekjoon Online Judge : https://www.acmicpc.net/problem/9012
//Question 9012 : 괄호  
//괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
//그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
//한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 
//그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” ,
//그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 

package level11;

import java.util.Scanner;

class LinkedList2 {
	private Node head;
	
	LinkedList2(){
		head = null;
	}
	
	private class Node{
		char data;
		Node next;
		
		Node(char data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(char data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void pop(){
		if(head != null){
			head = head.next;
		}
	}
	
	public char peek(){
		return head.data;
	}
}

public class Lv11_3_9012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LinkedList2 bracket = new LinkedList2();
		int brk;
		
		for(int i=0; i<num; i++){
			String input = sc.next();
			if(input.length() % 2 != 0)
				System.out.println("NO");
			else{
				brk = 0;
				for(int j=input.length()-1; j>=0;j--){
					bracket.push(input.charAt(j));
				}
				for(int j=0; j<input.length(); j++){
					if(bracket.peek() == '('){
						bracket.pop();
						brk++;
					}else if(bracket.peek() == ')'){
						if(brk <= 0) {
							brk--;
							break;
						}
						else{
							bracket.pop();
							brk--;
						}
					}
				}
				if(brk == 0) System.out.println("YES");
				else System.out.println("NO");
			}	
		}
	}
}
