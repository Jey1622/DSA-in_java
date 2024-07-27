package dynamicArray;
import java.util.*;

class dynamicArr<Type>{
	
	private static final int initialCapacity=4;
	private Type arr[];
	private int size;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	dynamicArr(){
		size=0;
		arr=(Type[]) new Object[initialCapacity];
		capacity=initialCapacity;
	}
	
	private void expandArray() {
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	private void shrinkArray() {
		capacity/=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void insert(Type val) {
		if(size==capacity)
			expandArray();
		arr[size++]=val;
		
	}
	
	public void display() {
		if(size==0)
			System.out.println("Your List is empty...!");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public void InsertAtPos(int pos,Type val) {
		if(size==capacity)
			expandArray();
		for(int i=size-1;i>=pos;i--) 
			arr[i+1]=arr[i];
		arr[pos]=val;
		size++;
		
	}
	
	public void DeleteAtPos(int pos) {
		for(int i=pos+1;i<size;i++) 
			arr[i-1]=arr[i];
		size--;
		if(capacity>initialCapacity && capacity>3*size) {
			shrinkArray();
		}
	}
	
	public void update(int pos,Type val) {
		if(pos<size)
			arr[pos]=val;
		else
			System.out.println("invalid position!");
			
	}
	
	public int position(Type val) {
		int pos=0;
		for(int i=0;i<size;i++) {
			if(val==arr[i])
				pos=i;
		}
		return pos;
	}
	
	public Type value(int pos) {
		Type val=null;
		if(pos<size)
			val=arr[pos];
		else
			System.out.println("invalid position!");
		return val;
	}
	
	public void clearList() {
		size=0;
		System.out.println("Your List is Cleared...");
	}

}

public class DynamicArray {

	public static void main(String[] args) {
		
		dynamicArr<Integer> list= new dynamicArr<Integer>();
		Scanner scan =new Scanner(System.in);
		int opc,val,pos;
		
		while(true) {
			System.out.println("\n-----List Menu----------");
			System.out.println("1.Insert at End.");
			System.out.println("2.Display List.");
			System.out.println("3.Insert the Specified position");
			System.out.println("4.Delete a Specified Position.");
			System.out.println("5.Update a value.");
			System.out.println("6.Get the position.");
			System.out.println("7.Search a value.");
			System.out.println("8.Clear a list.");
			System.out.println("9.Exit.");
			System.out.println("--------------------------------------------.");
			System.out.println("Enter your option : ");
			opc=scan.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Enter a Value : ");
				val=scan.nextInt();
				list.insert(val);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("Enter a position (pos start with 0) : ");
				pos=scan.nextInt();
				if(pos<0) {
					System.out.print("Invalid position.");
					break;
				}
				System.out.println("Enter a Value : ");
				val=scan.nextInt();
				list.InsertAtPos(pos,val);
				break;
			case 4:
				System.out.println("Enter a position (pos start with 0) : ");
				pos=scan.nextInt();
				if(pos<0) {
					System.out.print("Invalid position.");
					break;
				}
				list.DeleteAtPos(pos);
				break;
			case 5:
				System.out.println("Enter a position (pos start at 0) :");
				pos=scan.nextInt();
				if(pos<0) {
					System.out.print("Invalid position.");
					break;
				}
				System.out.print("\nEnter a Value : ");
				val=scan.nextInt();
				list.update(pos,val);
				break;
			case 6:
				System.out.println("Enter the value :");
				val=scan.nextInt();
				pos=list.position(val);
				System.out.println("The position is:"+pos);
				break;
			case 7:
				System.out.println("Enter the pos :");
				pos=scan.nextInt();
				if(pos<0) {
					System.out.print("Invalid position.");
					break;
				}
				val=list.value(pos);
				System.out.println("The position is:"+val);
				break;
			case 8:
				list.clearList();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.print("invalid data!");
				break;
			}
			
		}

	}

}
