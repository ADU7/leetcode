package array;

public class Question3 {
	public boolean containsDuplicate(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
			for(int j = i-1; j >= 0; j--) {
                if(nums[i] > nums[j])
                    break;
				else if(nums[i] == nums[j]) {
					System.out.print("true");
					return true;
				}
			}
		}
        System.out.print("false");
		return false;
    }
	
	public static void main(String[] args) {
		Question3 q3 = new Question3();
		int[] nums = {1,2,3,4};
		q3.containsDuplicate(nums);
	}
}
