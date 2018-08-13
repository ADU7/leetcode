package design;

import java.util.Arrays;
import java.util.Random;

public class Question1 {
	private int[] originalNums;
	private int[] currentNums;
	
	public Question1(int[] nums){
		originalNums = nums;
	}
	
	public int[] reset() {
		return originalNums;
	}
	
	public int[] shuffle() {
		currentNums = Arrays.copyOf(originalNums, originalNums.length);
		Random random = new Random();
		for(int i = currentNums.length-1; i >= 0; i--) {
			int randomIndex = random.nextInt(i+1);
			int temp = currentNums[i];
			currentNums[i] = currentNums[randomIndex];
			currentNums[randomIndex] = temp;
		}
		return currentNums;
	}
}
