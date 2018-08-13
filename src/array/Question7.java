package array;

public class Question7 {
	public int[] twoSum(int[] nums, int target) {
		int x = -1;
		int y = -1;
        for(int i = 0; i < nums.length; i++) {
        		for(int j = i + 1; j < nums.length; j++) {
        			if(nums[i] + nums[j] == target) {
        				x = i;
        				y = j;
        				break;
        			}
        		}
        		if(x != -1 && y != -1)
        			break;
        }
        int[] result = {x,y};
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		Question7 q7 = new Question7();
		int[] result = q7.twoSum(nums, target);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}
