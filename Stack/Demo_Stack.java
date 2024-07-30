package dsa.java;

public class Demo_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray array=new StackArray();
		StackLinkedList list=new StackLinkedList();
		
		//Stack using array
		
		array.push(5);
		array.push(8);
		array.push(2);
		array.push(6);
		array.display();
		System.out.println(" ");
		System.out.println("Poped Element is "+array.pop());
		
		array.display();
		System.out.println(" ");
		System.out.println("Peek Element is "+array.peek());
		System.out.println("-------------------------");
		
	// Stack using LinkedList	

		System.out.println("Stack is Empty "+list.isEmpty());
		list.push(5);
		list.push(8);
		list.push(2);
		list.push(6);
		list.display();
		System.out.println(" ");
		System.out.println("Poped Element is "+list.pop());
		list.display();
		System.out.println("Peek Element is "+list.peek());
		System.out.println("Stack is Empty "+list.isEmpty());
		
	}

}
