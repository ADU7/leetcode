package string;

public class Question7 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";
		if(strs.length == 1)
			return strs[0];
		//找出字符串数组中字符串长度最短的作为最长公共前缀，将其与每个字符遍历一次
		int minStrLen = Integer.MAX_VALUE;
		int index = 0;		//最短字符串对应下标
		for(int i = 0; i < strs.length; i++) {
			if(strs[i].length() < minStrLen) {
				minStrLen = strs[i].length();
				index = i;
			}
		}
		if(strs[index].length() == 0)
			return "";
		
		String commonPrefix = "";		//公共前缀
		for(int i = 0; i < strs[index].length(); i++) {
			for(int j = 0; j < strs.length; j++) {
				if(strs[index].charAt(i) != strs[j].charAt(i))
					return commonPrefix;
			}
			commonPrefix += strs[index].charAt(i);
		}
		return commonPrefix;
    }
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		Question7 q7 = new Question7();
		System.out.print(q7.longestCommonPrefix(strs));
	}
}
