package dsa.java;

public class StackLinkedList {
	Node top;
	class Node{
		Node next;
		int data;
		
		Node(int val){
			data=val;
			next=null;
		}
		
	}
	StackLinkedList(){
		top=null;
	}
	
	public void push(int val) {
		Node newnode=new Node(val);
		newnode.next=top;
		top=newnode;
	}
	
	public int pop() {
		if(top==null)
			throw new IndexOutOfBoundsException("Stack Underflow");
		int temp=top.data;
		top=top.next;
		return temp;
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}
