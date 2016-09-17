package tree;

import java.util.Stack;

public class KthSmallest {

	public static void main(String[] args) {

		KthSmallest ks =  new KthSmallest();
		
		TreeNode root=new TreeNode(6);
		root.right=new TreeNode(8);
		root.left=new TreeNode(4);
		root.left.left=new TreeNode(2);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(7);
		
		// Tree Structure 
		/*       6
		       /   \
	          4      8
	         / \     /
	        2   5   7
	          
	          */
	          
	          
	          
		System.out.println(ks.kthSmallest(root, 1));
	}
	
	public int kthSmallest(TreeNode root, int k) {
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode p = root;
	    while(p!=null){
	        stack.push(p);
	        p=p.left;
	    }
	    int i=0;
	    while(!stack.isEmpty()){
	        TreeNode t = stack.pop();
	        i++;
	 
	        if(i==k)
	            return t.val;
	 
	        TreeNode r = t.right;
	        while(r!=null){
	            stack.push(r);
	            r=r.left;
	        }
	 
	    }
	 
	    return -1;
	}

}
