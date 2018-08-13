package string;

public class Question4 {
	public boolean isPalindrome(String s) {
		String ss = s.toLowerCase();
		char[] charArray = ss.toCharArray();
		Character[] ch = new Character[charArray.length];
		for(int i = 0; i < ch.length; i++)
			ch[i] = charArray[i];		//自动装箱
		
		int sum = 0;
		for(int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i]) || Character.isDigit(ch[i]))
				sum += 1;
		}
		
		char[] purechar = new char[sum];
		for(int i = 0,j = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i]) || Character.isDigit(ch[i])) {
				purechar[j] = ch[i];		//自动拆箱
				j++;
			}
		}
		
		for(int i = 0,j = purechar.length-1; i < purechar.length/2; i++, j--) {
			if(purechar[i] != purechar[j]) {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		//String s = "A man, a plan, a canal: Panama";
		String ss = "race a car";
		Question4 q4 = new Question4();
		System.out.print(q4.isPalindrome(ss));
	}
}
