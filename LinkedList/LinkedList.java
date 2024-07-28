package linkedList.java;

import java.util.Iterator;

public class LinkedList<Type> implements Iterable<Type>{
	Node head;
	
	class Node{
		Type data;
		Node next;
		
		Node(Type val){
			data=val;
			next=null;
		}
	}
	
	LinkedList(){
		head=null;
	}
	
	public void insertAtBeginning(Type val) {
		Node newnode=new Node(val);
		//list is empty
		if(head==null)
			head=newnode;
		else {//list is not empty
			newnode.next=head;
			head=newnode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	public void insertAtPosition(int pos,Type val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		Node newnode=new Node(val);
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			if(temp==null) {
				
				throw new IndexOutOfBoundsException("Invalid Position - "+pos);
				
			}
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	
	public void deleteAtPos(int pos) {
		
		if(head==null) 
			throw new IndexOutOfBoundsException("Deetion attempted on empty list");
		
		if(pos==0){
			head=head.next;
			return;
		}
		
		Node temp=head;
		Node prev=null;
		
		for(int i=1;i<=pos;i++) {
			prev=temp;//track the previous node
			temp=temp.next; //jump the next node
		}
		prev.next=temp.next; //reassign the pointers
	}
	public void deleteAtBeginning() {
		if(head==null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		
		head=head.next;
		return;
	}
	public void reverse() {
		Node prev=null;
		Node current = head;
		Node next=head.next;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
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
