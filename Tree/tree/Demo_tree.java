package dsa.java;

public class Demo_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTree tree=new binaryTree(10);
		tree.insertLeft(tree.root, 5);
		tree.insertRight(tree.root, 15);
		tree.insertLeft(tree.root.left, 3);
		tree.insertRight(tree.root.left, 8);
		tree.insertLeft(tree.root.right, 12);
		
		binaryTree.preOrder(tree.root);
		System.out.println();
		binaryTree.inOrder(tree.root);
		System.out.println();
		binaryTree.postOrder(tree.root);
		System.out.println();


	}

}
