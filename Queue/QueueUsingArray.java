package dsa.java;

public class QueueUsingArray {
	static final int MAX_SIZE=30;
	int front,rear;
	int arr[];
	
	QueueUsingArray() {
		front=-1;
		rear=-1;
		arr=new int[MAX_SIZE];
	}
	
	public void enqueue(int val) {
		if(rear==MAX_SIZE-1) 
			throw new IndexOutOfBoundsException("Queue is overflow");
		if(front==-1)
			front++;
		arr[++rear]=val;
		
	}
	
	public int dequeue() {
		if(front==-1 || front>rear)
			throw new IndexOutOfBoundsException("Queue is underflow");
		int temp=arr[0];
		for(int i=1;i<=rear;i++)
			arr[i-1]=arr[i];
		rear--;
		
		return temp;
	}
	
	public void display() {
		for(int i=0;i<=rear;i++)
			System.out.print(arr[i]+" ");
		
	}
	
}
