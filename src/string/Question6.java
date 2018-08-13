package string;

public class Question6 {
	public int strStr(String haystack, String needle) {
		int index = -1;
		int compareLen = haystack.length()-needle.length()+1;		//进行比较次数
		for(int i = 0; i < compareLen; i++) {
			for(int j = 0; j < needle.length(); j++) {
				if(needle.charAt(j) != haystack.charAt(i+j))
					break;
				if(j == needle.length()-1) 
					index = i;
			}
			if(index != -1)
				break;
		}
		return index;
    }
	
	public static void main(String[] args) {
		String haystack = "helllo";
		String needle = "ll";
		Question6 q6 = new Question6();
		System.out.print(q6.strStr(haystack, needle));
	}
}
