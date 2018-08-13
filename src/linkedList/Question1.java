package linkedList;

public class Question1 {
	private static class Node{
		int val;
		Node next;
		public Node(int x) {
			val = x;
		}
	}
	
	public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
