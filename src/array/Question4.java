package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int index = 0;
		ArrayList<Integer> nums3  = new ArrayList<>();
		for(int i = 0; i < nums1.length; i++) {
			if(nums2[0] == nums1[i]) {
				index = i;		//记录数组nums1中与nums2[0]相等的元素下标
				break;
			}
				
		}
		if(nums1.length-index > nums2.length) {
			for(int i = 0; i < nums2.length; i++) {
				for(int j = index; j < nums1.length; j++) {
					if(nums2[i] == nums1[j]) {
						nums3.add(nums2[i]);
						index = j+1;
						break;
					}
				}
			}
		}
		else {
			int index1 = 0;
			for(int i = index; i < nums1.length; i++) {
				for(int j = index1; j < nums2.length; j++) {
					if(nums1[i] == nums2[j]) {
						nums3.add(nums1[i]);
						index1 = j+1;
						break;
					}
				}
			}
		}
		int len = nums3.size();
		int[] nums4 = new int[len];
		for(int i = 0; i < len; i++)
			nums4[i] = nums3.get(i);
		
		return nums4;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {5,4,3,2,2,1,1};
		int[] nums2 = {6,7,4,2,2};
		Question4 q4 = new Question4();
		int[] nums4 = q4.intersect(nums1, nums2);
		for(int i = 0; i < nums4.length; i++)
			System.out.print(nums4[i] + " ");
	}
}
