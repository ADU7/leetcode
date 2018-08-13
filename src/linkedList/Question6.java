package linkedList;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
	private static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	
	//哈希表，时间复杂度O(n),空间复杂度O(n)
//	public boolean hasCycle(ListNode head) {
//		Set<ListNode> set = new HashSet<>();
//		while(head != null) {
//			if(set.contains(head))
//				return true;
//			else
//				set.add(head);
//			head = head.next;
//		}
//		return false;
//    }
	
	//快慢指针，类比快慢跑步者在环形跑道跑步，若存在环，则快者追上慢者，若不存在环，快者先到达终点
	//时间复杂度O(n),空间复杂度O(1)
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null)
			return false;
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast != slow) {
			if(fast == null || fast.next == null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}
