package tree;

public class PreOrder {

	public static void main(String[] args) {
		PreOrder p= new PreOrder();
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(3);
		root.left=new TreeNode(2);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		
      p.Recursive(root);
		
	}
	
	public void Recursive(TreeNode root){
		if(root==null) return ;
			System.out.print(root.val+" ");
		Recursive(root.left);
		Recursive(root.right);
		
	}

}
