package linkedList.java;
import java.util.*;

public class Demo_CircularLinkedList {
	public static void main(String[] args) {
		CircularLinkedList<String> list=new CircularLinkedList<String>();
		list.insertAtBeginning("Ant man");
		list.insertAtEnd("Iron man");
		list.insertAtBeginning("groot");
		list.insertAtBeginning("Spider man");
		list.display();
		System.out.println(" ");
		
		list.deleteAtBeginning();
		list.display();
		System.out.println(" ");
		
		list.deleteAtEnd();
		list.display();
	}
}
