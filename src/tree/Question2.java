package tree;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val = x;
		}
	}
	
//	public boolean isValidBST(TreeNode root) {
//		if(root == null)
//			return true;
//		return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
//	}
//	
//	public boolean valid(TreeNode root, long low, long high) {
//		if(root == null)
//			return true;
//		if(root.val <= low || root.val >= high)
//			return false;
//		return valid(root.left,low,root.val) && valid(root.right,root.val,high);
//	}
	
	//递归中序遍历
	public boolean isValidBST(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		enlist(root,list);
		for(int i = 0; i < list.size()-1; i++) {
			if(list.get(i) >= list.get(i+1))
				return false;
		}
		return true;
	}
	
	public void enlist(TreeNode node, List<Integer> list) {
		if(node == null)
			return;
		enlist(node.left,list);
		list.add(node.val);
		enlist(node.right,list);
	}
}
