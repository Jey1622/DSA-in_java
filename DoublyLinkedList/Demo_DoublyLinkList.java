package linkedList.java;

public class Demo_DoublyLinkList {
	public static void main(String args[]) {
		DoublyLinkedList<Integer> list=new DoublyLinkedList<Integer>();
		
		
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.insertAtBeginning(3);
		list.insertAtBeginning(6);
		list.display();
		System.out.println(" ");
		list.displayRev();
		System.out.println(" ");
		list.insertAtPosition(2,10); 
		list.display();
		System.out.println(" ");
		list.deleteAtPos(8); 
		list.display();
		System.out.println(" ");
		list.displayRev();
		
	}
}
