package tree;

import java.util.Stack;

public class Question3 {
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val = x;
		}
	}
	
	//递归解决
//	public boolean isSymmetric(TreeNode root) {
//		if(root == null)
//			return true;
//		return symmetrix(root.left,root.right);
//	}
//	
//	private boolean symmetrix(TreeNode p, TreeNode q) {
//		//同时为空
//		if(p == null && q == null)
//			return true;
//		//只有一个空
//		if(p == null || q == null)
//			return false;
//		return p.val == q.val && symmetrix(p.left,q.right) && symmetrix(p.right,q.left);
//	}
	
	//迭代解决，利用栈
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = root.left;
		TreeNode q = root.right;
		stack.push(p);
		stack.push(q);
		while(!stack.empty()) {
			p = stack.peek();
			stack.pop();
			q = stack.peek();
			stack.pop();
			if(p == null && q == null)
				continue;
			if(p == null || q == null)
				return false;
			if(p.val != q.val)
				return false;
			stack.push(p.left);
			stack.push(q.right);
			stack.push(p.right);
			stack.push(q.left);
		}
		return true;
	}
}
