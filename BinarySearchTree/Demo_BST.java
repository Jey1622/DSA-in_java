package dsa.java;

public class Demo_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree(50);
		bst.insert(20);
		bst.insert(70);
		bst.insert(10);
		bst.insert(25);
		bst.insert(60);
		bst.insert(90);
		bst.inOrder(bst.root);
		if(bst.Search(bst.root, 70)==null)
			System.out.println("Not found");
		else 
			System.out.println("found");
	}

}
