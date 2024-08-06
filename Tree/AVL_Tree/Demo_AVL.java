package dsa.java;

public class Demo_AVL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL avl=new AVL(50);
		avl.insert(20);
		avl.insert(60);
		avl.insert(10);
		avl.insert(30);
		avl.insert(40);
		avl.inOrder(avl.root);
	}

}
