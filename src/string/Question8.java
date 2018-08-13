package string;

import java.util.HashMap;
import java.util.Map;

public class Question8 {
//	public boolean isAnagram(String s, String t) {
//		if(s.length() != t.length())
//			return false;
//		Map<Character,Integer> map1 = new HashMap<>();
//		Map<Character,Integer> map2 = new HashMap<>();
//		for(int i = 0; i < s.length(); i++) {
//			Integer value1 = map1.get(s.charAt(i));
//			map1.put(s.charAt(i), value1 == null ? 1 : value1+1);
//			Integer value2 = map2.get(t.charAt(i));
//			map2.put(t.charAt(i), value2 == null ? 1 : value2+1);
//		}
//		for(Character key:map1.keySet()) {
//			if(map1.get(key) != map2.get(key)) 
//				return false;
//		}
//		return true;
//    }
	public boolean isAnagram(String s, String t) {
		int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet){
            if (i != 0) 
                return false;
        } 
        return true;
	}
	
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		Question8 q8 = new Question8();
		System.out.print(q8.isAnagram(s, t));
	}
}
