package tree;

public class Height {

	public static void main(String[] args) {
		PreOrder p = new PreOrder();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
     System.out.println(calculateHeight(root));
	}
	
	public static int calculateHeight(TreeNode root){
		if(root==null) return -1;
		return Math.max(calculateHeight(root.left), calculateHeight(root.right))+1;
	}

}
