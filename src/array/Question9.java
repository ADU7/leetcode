package array;

import java.util.HashMap;

public class Question9 {
	public int singleNumber(int[] nums) {
		int singleNumber = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			Integer value = map.get(nums[i]);
			map.put(nums[i], (value == null ? 0 : value) + 1);
		}
		for(Integer key:map.keySet()) {
			Integer temp = map.get(key);
			if(temp == 1) {
				singleNumber = key;
				break;
			}
		}
		return singleNumber;
    }
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		Question9 q9 = new Question9();
		int singleNumber = q9.singleNumber(nums);
		System.out.print(singleNumber);
	}
}
