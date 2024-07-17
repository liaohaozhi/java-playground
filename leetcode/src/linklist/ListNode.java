package linklist;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public static void printList(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
    }
}
