package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question4 {
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val = x;
		}
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(root == null)
			return result;
		
		queue.offer(root);		//根结点入队头
		while(!queue.isEmpty()) {
			int levelnum = queue.size();		//获取每层结点个数
			List<Integer> subList = new ArrayList<>();
			
			//遍历当前层结点
			for(int i = 0; i < levelnum; i++) {
				TreeNode node = queue.poll();	//队尾元素出队
				subList.add(node.val);
				
				if(node.left != null)
					queue.offer(node.left);
				
				if(node.right != null)
					queue.offer(node.right);
			}
			
			result.add(subList);
		}
		
		return result;
    }
}
