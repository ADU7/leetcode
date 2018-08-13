package others;

public class Question1 {
//	private String decimalToBinary(long n) {
//		String str = "";
//		if(n == 0)
//			return "0";
//		while(n != 0) {
//			str = n%2 + str;
//			n = n /2;
//		}
//		return str;
//	}
//	
//	// you need to treat n as an unsigned value
//    public int hammingWeight(long n) {
//    		String str = decimalToBinary(n);
//    		int count = 0;
//    		for(int i = 0; i < str.length(); i++) {
//    			if(str.charAt(i) == '1')
//    				count++;
//    		}
//    		return count;
//    }
//    
//    public static void main(String[] args) {
//    		Question1 q1 = new Question1();
//    		System.out.println(q1.hammingWeight(4294967295l));
//    }
	
	public int hammingWeight(int n) {
		int flag = 1;
		int count = 0;
		while(flag != 0) {
			if((flag&n) != 0)
				count++;
			flag = flag << 1;
		}
		return count;
	}
}
