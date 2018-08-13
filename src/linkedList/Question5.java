package linkedList;

import java.util.Stack;

public class Question5 {
	private static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	
	//利用栈实现，时间复杂度O(n),空间复杂度O(n)
//	public boolean isPalindrome(ListNode head) {
//		if(head == null || head.next == null)
//			return true;
//		ListNode slow = head;
//		ListNode fast = head;
//		Stack<Integer> stack = new Stack<>();
//		//快慢指针
//		while(fast != null && fast.next != null) {
//			stack.push(slow.val);
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		//当链表长度为奇数时，跳过中间元素
//		if(fast != null)
//			slow = slow.next;
//		while(slow != null) {
//			if(stack.pop() != slow.val)
//				return false;
//			slow = slow.next;
//		}
//		return true;
//	}
	
	//快慢指针寻找中间结点，反转后半部分链表，时间复杂度O(n),空间复杂度O(1)
	private ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode p = head;
		ListNode q = head.next;
		ListNode r = head.next.next;
		p.next = null;
		while(r != null) {
			q.next = p;
			p = q;
			q = r;
			r = r.next;
		}
		q.next = p;
		return q;
	}
	
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null) {
			//当链表长度为奇数时，跳过中间元素
			slow.next = reverseList(slow.next);
			slow = slow.next;
		} else {
			//当链表长度为偶数
			slow = reverseList(slow);
		}
		while(slow != null) {
			if(head.val != slow.val)
				return false;
			head = head.next;
			slow = slow.next;
		}
		return true;
	}
	
}
