package linkedList.java;

public class CircularLinkedList <Type>{
	Node last;
	class Node{
		Type data;
		Node next;
		Node(Type val){
			data=val;
			next=null;
		}
	}
	CircularLinkedList(){
		last=null;
	}
	
	public void insertAtBeginning(Type val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
		}
	}
	
	public void insertAtEnd(Type val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
	}
	
	public void display() {
		if(last==null) {
			System.out.println("List is Empty!...");
			return;
		}
		Node  temp=last.next;
		do {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	
	public Type deleteAtBeginning() {
		if(last==null)
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		Type temp=last.next.data;
		if(last.next==last)
			last=null;
		else {
			last.next=last.next.next;
		}
		return temp;
	}
	
	public void deleteAtEnd() {
		if(last==null)
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		if(last.next==last)
			last=null;
		else {
			Node temp=last.next;
			while(temp.next!=last) {
				temp=temp.next;
			}
			temp.next=last.next;
			last=temp;
		}
	}
}
