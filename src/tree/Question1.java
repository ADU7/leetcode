package tree;

public class Question1 {
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val = x;
		}
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		else
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
