package array;

public class Question2 {
	public void rotate(int[] nums, int k) {
        for(int i = 1; i <= k; i++) {
            int t = nums[nums.length-1];
			for(int j = nums.length-2; j >= 0; j--) {
				nums[j+1] = nums[j];
			}
            nums[0] = t;
		}
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		Question2 q2 = new Question2();
		q2.rotate(nums, k);
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}
	
}
