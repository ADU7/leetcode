package others;

import java.util.Stack;

public class Question4 {
	public boolean isValid(String s) {
		if(s.equals(""))
			return true;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) =='{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			else if(stack.isEmpty())
				return false;
			else if(s.charAt(i) == ')' && stack.peek() == '(') 
					stack.pop();
			else if(s.charAt(i) == '}' && stack.peek() == '{') 
					stack.pop();
			else if(s.charAt(i) == ']' && stack.peek() == '[') 
					stack.pop();
			else
				return false;
		}
		return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		Question4 q4 = new Question4();
		String s = "(]";
		System.out.print(q4.isValid(s));
	}
}
