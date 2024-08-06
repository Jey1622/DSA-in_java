package dsa.java;

public class AVL {
	Node root;
	class Node{
		int key;
		Node left,right;
		int height;
		
		public Node(int val){
			key=val;
			left=right=null;
			height=0;
		}
	}
	
	public AVL(int val){
		root=new Node(val);
	}
	
	public AVL(){
		root=null;
	}
	
	public int getheight(Node node) {
		if(node==null)
			return -1;
		return node.height;
	}
	
	public int max(int a,int b) {
		return a>b?a:b;
	}
	
	private int getbalance(Node node) {
		if(node==null)
			return 0;
		return getheight(node.left)-getheight(node.right);
	}
	
	private Node rightRotate(Node z) {
		Node y=z.left;
		Node t3=y.right;
		
		y.right=z;
		z.left=t3;
		
		z.height=1+max(getheight(z.left),getheight(z.right));
		y.height=1+max(getheight(y.left),getheight(y.right));
		
		return y;
	}
	
	private Node leftRotate(Node z) {
		Node y=z.right;
		Node t3=y.left;
		
		y.left=z;
		z.right=t3;
		
		z.height=1+max(getheight(z.left),getheight(z.right));
		y.height=1+max(getheight(y.left),getheight(y.right));
		
		return y;
	}
	
	public void insert(int val) {
		root=insert(root,val);
	}
	
	public Node insert(Node node,int val) {
		if(node==null)
			return new Node(val);
		if(val<node.key)
			node.left=insert(node.left,val);
		else if(val>node.key)
			node.right=insert(node.right,val);
		else 
			return node;
		
		node.height=1+max(getheight(node.left),getheight(node.right));
//		if(val==40)
//			System.out.println("The height of node"+node.key+" is updated as "+node.height);
		int balfactor=getbalance(node);
		
		//LL case
		if(balfactor>1 && val<node.left.key) {
			return leftRotate(node);
		}
		//LR case
		if(balfactor>1 && val>node.left.key) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}
		//RR case
		if(balfactor<-1 && val>node.right.key) {
			return rightRotate(node);		
		}
		//RL case
		if(balfactor<-1 && val<node.right.key) {
			node.right=rightRotate(node.right);	
			return leftRotate(node);
		}
		
		return node;
	}
	
	public  void  inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.key+" height is "+root.height);
			inOrder(root.right);
		}
	}
}
