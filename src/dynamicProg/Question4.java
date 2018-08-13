package dynamicProg;

public class Question4 {
	public int rob(int[] nums) {
		if(nums.length == 0)
			return 0;
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		if(nums.length > 1)
			sum[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i++)
			sum[i] = Math.max(sum[i-1], sum[i-2]+nums[i]);
		return sum[nums.length-1];
    }
}
