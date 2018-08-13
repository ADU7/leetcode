package dynamicProg;

public class Question3 {
	public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
        		sum += nums[i];
        		if(sum > maxsum)
        			maxsum = sum;
        		if(sum < 0)
        			sum = 0;
        }
        return maxsum;
    }
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		Question3 q3 = new Question3();
		System.out.print(q3.maxSubArray(nums));
	}
}
