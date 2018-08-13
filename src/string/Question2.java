package string;

public class Question2 {
	/**
	public int reverse(int x) {
		if(x == 0)
			return 0;
		
		String str = String.valueOf(x);
		char[] charArray = str.toCharArray();
		
		int sumOfZeroEnd = 0;
		for(int i = charArray.length-1; i >=0; i--) {
			if(charArray[i] == '0') {
				sumOfZeroEnd += 1;
			}
			break;
		}
		
		char[] newcharArray = new char[charArray.length-sumOfZeroEnd];
		for(int i = 0; i < charArray.length-sumOfZeroEnd; i++)
			newcharArray[i] = charArray[i];
		
		String result;
		if(newcharArray[0] == '-') {
			for(int i = 1; i < (newcharArray.length+1)/2; i++) {
				char temp = newcharArray[i];
				newcharArray[i] = newcharArray[newcharArray.length-1-i+1];
				newcharArray[newcharArray.length-1-i+1] = temp;
			}
			result = String.valueOf(newcharArray);
		}
		else {
			for(int i = 0; i < newcharArray.length/2; i++) {
				char temp = newcharArray[i];
				newcharArray[i] = newcharArray[newcharArray.length-1-i];
				newcharArray[newcharArray.length-1-i] = temp;
			}
			result = String.valueOf(newcharArray);
		}
		
		long number = Long.parseLong(result);
		if(number >= -Math.pow(2, 31) && number <= Math.pow(2, 31)-1)
			return (int)number;
		else
			return 0;
    }
    */
	public int reverse(int x) {
        long result = 0;
        while (x!=0){
            result = result * 10 +x%10;
            x/=10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return  0;
        }else{
            return (int)result;
        }
    }
	
	public static void main(String[] args) {
		int x = 123;
		Question2 q2 = new Question2();
		System.out.print(q2.reverse(x));
	}
}
