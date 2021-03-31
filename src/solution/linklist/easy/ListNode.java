package solution.linklist.easy;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    static void printList(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
    }
}
