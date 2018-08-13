package design;

import java.util.Stack;

public class MinStack {
	private int min_val = Integer.MAX_VALUE;
    private Stack<Integer> s = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if (x <= min_val) {
            s.push(min_val);
            min_val = x;
        }
        s.push(x);
    }
    
    public void pop() {
        if (s.pop() == min_val) 
            min_val = s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min_val;
    }
    
    public static void main(String[] args) {
    		MinStack minStack = new MinStack();
    		minStack.push(-2);
    		minStack.push(0);
    		minStack.push(-3);
    		minStack.pop();
    		minStack.getMin();
    }
}
