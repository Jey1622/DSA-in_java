package linkedList.java;

import java.util.Iterator;

public class DoublyLinkedList<Type> implements Iterable<Type>{
	Node head;
	Node tail;
	
	class Node{
		Type data;
		Node prev;
		Node next;
		
		Node(Type val){
			data=val;
			next=null;
			prev=null;
		}
	}
	
	DoublyLinkedList(){
		head=null;
		tail=null;
	}
	
	public void insertAtBeginning(Type val) {
		Node newnode=new Node(val);
		newnode.next=head;
		//list is empty
		if(head==null)
		{
			tail=newnode;
		}
		
		else {//list is not empty
			head.prev=newnode;
		}
		head=newnode;
	}
	public void display() {
		if(head==null)
			System.out.println("The List is Empty...");
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	public void displayRev() {
		if(head==null)
			System.out.println("The List is Empty...");
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.prev;
		}
	}
	public void insertAtPosition(int pos,Type val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		Node newnode=new Node(val);
		Node temp=head;
		for(int i=1;i<pos;i++) {//jump to prev node
			temp=temp.next;
			if(temp==null) {
				
				throw new IndexOutOfBoundsException("Invalid Position - "+pos);
				
			}
		}
		
		newnode.next=temp.next;
		newnode.prev=temp;
		if(temp==tail)
			tail=newnode;
		else
			temp.next.prev=newnode;
		temp.next=newnode;
		
	}
	
	public void deleteAtPos(int pos) {
		
		if(head==null) 
			throw new IndexOutOfBoundsException("Deetion attempted on empty list");
		
		if(pos==0){
			head=head.next;
			if(head==null)
				tail=null;
			else
				head.prev=null;
			return;
		}
		
		Node temp=head;
		Node prev=null;
		
		for(int i=1;i<=pos;i++) {
			prev=temp;//track the previous node
			temp=temp.next; //jump the next node
			if(temp==null)
				throw new IndexOutOfBoundsException("Invalid position");
		}
		prev.next=temp.next;
		if(temp.next==null)
			tail=prev;
		else
			temp.next.prev=prev;//reassign the pointers
	}
	public void deleteAtBeginning() {
		if(head==null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		
		
		head=head.next;
		if(head==null)
			tail=null;
		else
			head.prev=null;
		return;
		
	}
	

	@Override
	public Iterator<Type> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterator<Type>() {
			Node temp=head;
			public boolean hasNext() {
				return temp!=null;
			}
			
			public Type next() {
				Type val=temp.data;
				temp=temp.next;
				return val;
			}
		};
	}
}
