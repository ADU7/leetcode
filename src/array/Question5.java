package array;

public class Question5 {
	/*对于数组长度很长的无法表示
	public int[] plusOne(int[] digits) {
		long sum = 0;
		for(int i = digits.length-1,j = 0; i >= 0 ; i--,j++) {
			sum += digits[i]*Math.pow(10, j);
		}
		sum += 1;
		String s = Long.toString(sum);
		int[] result = new int[s.length()]; 
		for(int i = 0; i < s.length(); i++) {
			result[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		Question5 q5 = new Question5();
		int[] result = q5.plusOne(digits);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
	*/
	
	public int[] plusOne(int[] digits) {
		for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newdigits = new int[digits.length+1];
		newdigits[0] = 1;
		return newdigits;
	}
	
	public static void main(String[] args) {
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		Question5 q5 = new Question5();
		int[] result = q5.plusOne(digits);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}
