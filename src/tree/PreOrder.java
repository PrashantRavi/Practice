package tree;

public class PreOrder {

	public static void main(String[] args) {
		PreOrder p = new PreOrder();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		p.FindLeaveNode(root);

	}

	public void preorder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);

	}

	public void postorder(TreeNode root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}

	public void inorder(TreeNode root) {

	}

	public void FindLeaveNode(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			System.out.println(root.val);
		}
		FindLeaveNode(root.left);
		FindLeaveNode(root.right);
	}

}
