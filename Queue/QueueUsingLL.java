package dsa.java;

public class QueueUsingLL {
	Node front,rear;
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data =val;
			next=null;
		}
	}
	
	QueueUsingLL(){
		front=null;
		rear=null;
	}
	
	public void enqueue(int val) {
		Node newnode=new Node(val);
		if(front==null)
			front=newnode;
		else
			rear.next=newnode;
		rear=newnode;
	}
	
	public int dequeue() {
		if(front==null)
			throw new IndexOutOfBoundsException("Queue is underflow");
		int temp=front.data;
		front=front.next;
		if(front==null)
			rear=null;
		return temp;
	}
	
	public void display() {
		Node temp=front;
		if(temp==null ) {
			System.out.println("Queue is empty");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
