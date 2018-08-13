package string;

import java.util.LinkedHashMap;

public class Question3 {
	public int firstUniqChar(String s) {
		char[] charArray = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < charArray.length; i++) {
			Integer value = map.get(charArray[i]);
			map.put(charArray[i], (value == null ? 0 : value) + 1);
		}
		char firstUniqChar = 0;
		for(Character key:map.keySet()) {
			Integer value = map.get(key);
			if(value == 1) {
				firstUniqChar = key;
				break;
			}
		}
		int index = -1;
		for(int i = 0; i < charArray.length; i++) {
			if(firstUniqChar == charArray[i]) {
				index = i;
				break;
			}
		}
		return index;
    }
	
	public static void main(String[] args) {
		String s = "loveleetcode";
		Question3 q3 = new Question3();
		System.out.print(q3.firstUniqChar(s));
	}
}
