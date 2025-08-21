package binary_Tree;

import java.util.Scanner;



public class PreOrderTraversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node root=createBT(sc);
		preorderT(root);

	}
	static Node createBT(Scanner sc)
	{
		Node root=null;
		System.out.println("enter data");
		int data=sc.nextInt();
		if(data==-1)
		{
			return null;
		}
		root=new Node(data);
		System.out.println("enter  left data"+data);
		root.left=createBT(sc);
		System.out.println("enter  right data"+data);
		root.right=createBT(sc);
		return root;
		
	}
	
	static void preorderT(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorderT(root.left);
		
		preorderT(root.right);
	}

	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int key)
		{
			data=key;
			left=null;
			right=null;
		}

	}

}
