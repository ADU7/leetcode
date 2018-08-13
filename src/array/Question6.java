package array;

public class Question6 {
	public void moveZeroes(int[] nums) {
		int NotZero = 0;
		for(int i = 0, j = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[j] = nums[i];
				j += 1;
				NotZero += 1;
			}
		}
		for(int i = NotZero; i < nums.length; i++)
			nums[i] = 0;
		
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		Question6 q6 = new Question6();
		q6.moveZeroes(nums);
	}
}
