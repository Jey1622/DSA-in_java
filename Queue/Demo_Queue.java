package dsa.java;

public class Demo_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray qa=new QueueUsingArray();
		QueueUsingLL qll=new QueueUsingLL();
		qa.enqueue(4);
		qa.enqueue(8);
		qa.enqueue(0);
		qa.enqueue(2);
		qa.display();
		System.out.println(" ");
		qa.dequeue();
		qa.dequeue();
		qa.display();
		System.out.println(" ");
		System.out.println("----------------------------");
		
		qll.enqueue(4);
		qll.enqueue(8);
		qll.enqueue(0);
		qll.enqueue(2);
		
		qll.display();
		System.out.println(" ");
		qll.dequeue();
		qll.dequeue();
		qll.display();
		System.out.println(" ");

	}

}
