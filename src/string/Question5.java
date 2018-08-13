package string;

public class Question5 {
	public int myAtoi(String str) {
		//空字符串，返回0
		if(str == null)
			return 0;
		if(str.equals(""))
			return 0;
		
		str = str.trim();
		char[] charArray = str.toCharArray();
		
		if(charArray.length > 0) {
			if(charArray[0] == '-' || charArray[0] == '+' || (charArray[0] >= '0' && charArray[0] <= '9')) {
				int index = 0;
				for(int i = 1; i < charArray.length; i++) {
					if(charArray[i] >= '0' && charArray[i] <= '9')
						index = i;
					else
						break;
				}
				String subString = String.valueOf(charArray, 0, index+1);
				
				if(subString.equals("-") || subString.equals("+"))
					return 0;
				
				int indexNotNullZero = subString.length()-1;
				for(int i = 0; i < subString.length(); i++) {
					if(subString.charAt(i) >= '1' && subString.charAt(i) <= '9') {
						indexNotNullZero = i;
						break;
					}
				}
				String newSubString = "";
				if(subString.charAt(0) == '-')
					newSubString = '-' + subString.substring(indexNotNullZero, subString.length());
				else
					newSubString = subString.substring(indexNotNullZero, subString.length());
				
				if(newSubString.length() > 11 && newSubString.charAt(0) == '-')
					return Integer.MIN_VALUE;
				if(newSubString.length() > 11 && newSubString.charAt(0) != '-')
					return Integer.MAX_VALUE;
				
				long number = Long.parseLong(newSubString);
				if(number < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
				else if(number > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				else
					return (int)number;
				
			} else {
				return 0;
			}
		}
		return 0;
		
    }
	
	public static void main(String[] args) {
		String str = "  -000012 99";
		System.out.println(str.trim());
		Question5 q5 = new Question5();
		System.out.print(q5.myAtoi(str));
	}
}
