package linkedList;

public class Question4 {
	private static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l = new ListNode(0);
		ListNode curr = l;
		while(l1 != null && l2 != null) {
			if(l1.val > l2.val) {
				curr.next = l2;
				l2 = l2.next;
			} else {
				curr.next = l1;
				l1 = l1.next;
			}
            curr = curr.next;
		}
		curr.next = (l1 == null) ? l2:l1;
		return l.next;
	}
}
