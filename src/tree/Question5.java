package tree;

public class Question5 {
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val = x;
		}
	}
		
	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums,0,nums.length-1);
    }
	
	private TreeNode sortedArrayToBST(int[] nums, int begin, int end) {
		if(begin > end)
			return null;
		int mid = (begin+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBST(nums,begin,mid-1);
		root.right = sortedArrayToBST(nums,mid+1,end);
		return root;
	}
}
