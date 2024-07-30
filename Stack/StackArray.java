package dsa.java;

public class StackArray {
	static final int MAX_SIZE=30;
	int arr[]=new int[MAX_SIZE];
	int top;
	
	StackArray() {
		top=-1;
	}
	
	public void push(int val) {
		if(top==MAX_SIZE-1) {
			throw new IndexOutOfBoundsException("Stack is overflow");
		}
		arr[++top]=val;
	}
	
	public int pop() {
		if(top==-1) {
			throw new IndexOutOfBoundsException("Stack is underflow");
		}
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public void display() {
		int temp=top;
		while(temp!=-1) {
			System.out.print(arr[temp]+" ");
			temp--;
		}
	}
}
