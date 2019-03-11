package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(3);
		root.left=new TreeNode(2);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		LevelOrderTraversal lt = new LevelOrderTraversal();
		
		ArrayList<ArrayList<Integer>> test= lt.levelOrder(root);
		System.out.println(test);

	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
	    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> nodeValues = new ArrayList<Integer>();
	    if(root == null)
	        return al;
	 
	    
	    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
	    LinkedList<TreeNode> next = new LinkedList<TreeNode>();
	    current.offer(root);
	 
	    while(!current.isEmpty()){
	        TreeNode node = current.poll();
	 
	        if(node.left != null)
	            next.add(node.left);
	        if(node.right != null)
	            next.add(node.right);
	 
	        nodeValues.add(node.val);
	        if(current.isEmpty()){
	            current = next;
	            next = new LinkedList<TreeNode>();
	            al.add(nodeValues);
	            nodeValues = new ArrayList();
	        }
	 
	    }
	    return al;
	}
	
	
	

}
