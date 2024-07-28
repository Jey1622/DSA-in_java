package linkedList.java;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.insertAtBeginning(3);
		list.insertAtBeginning(6);
		list.display();
		System.out.println(" ");
		list.insertAtPosition(4,10); 
		list.display();
		System.out.println(" ");
		list.deleteAtPos(2);
		list.display();
		System.out.println(" ");
		list.deleteAtPos(0);
		list.display();
		System.out.println(" ");
		for(int a:list) {
			System.out.print(a+" ");
		}
		list.reverse();
		System.out.println(" ");
		for(int a:list) {
			System.out.print(a+" ");
		}
		
	}

}
