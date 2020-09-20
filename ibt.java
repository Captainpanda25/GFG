	class Node{
		int data;
		Node left=null,right=null;
		Node(int data)
		{
			this.data=data;
		}
	}
public class ibt {

	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void swap(Node root) {
		if(root==null) {
			return;
		}
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	public static void invert(Node root) {
		if(root==null) {
			return;
		}
		swap(root);
		invert(root.left);
		invert(root.right);
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.right=new Node(5);
		root.left.left=new Node(4);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		invert(root);
		preorder(root);

	}

}
