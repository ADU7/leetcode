package string;

public class Question1 {
	public String reverseString(String s) {
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-1-i];
			charArray[charArray.length-1-i] = temp;
		}
		String result = String.valueOf(charArray);
		return result;
    }
	
	public static void main(String[] args) {
		String s = "hello";
		Question1 q1 = new Question1();
		String result = q1.reverseString(s);
		System.out.print(result);
	}
}