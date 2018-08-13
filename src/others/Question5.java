package others;

public class Question5 {
	public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]] = 1;
        }
        int result = -1;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
