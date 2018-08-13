package array;

public class Question1 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        else{
            int len = 0;
		for(int j = 1,i = 0; j < nums.length; j++) {
			if(nums[i] == nums[j])
				continue;
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
				len = i;				//i为下标，新长度实际应为i+1
			}
		}
		for(int i = 0; i < len+1; i++) {
			System.out.print(nums[i] + " ");
		}
		return len+1;
        }
        
    }
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Question1 q1 = new Question1();
		q1.removeDuplicates(nums);
	}

}
