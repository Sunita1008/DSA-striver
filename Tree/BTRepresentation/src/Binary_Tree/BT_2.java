package Binary_Tree;
import java.util.*;
public class BT_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
           Node root=createBT(sc);
	         }

	public static Node createBT(Scanner sc) {
		Node root=null;
		
		System.out.println("Enter data");
		int data=sc.nextInt();
		
		if(data==-1)
		{
			return null;
		}
		root=new Node(data);
		
		System.out.println("enter left of "+data);
		root.left=createBT(sc);
		
		System.out.println("enter right of"+data);
		root.right=createBT(sc);
		
		return root;
		
		
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
