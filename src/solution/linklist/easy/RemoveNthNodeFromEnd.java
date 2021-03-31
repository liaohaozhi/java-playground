package solution.linklist.easy;

public class RemoveNthNodeFromEnd {

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        int i = 1;
        ListNode previousNode = new ListNode(i);
        ListNode head = previousNode;
        while (++i <= 6){
            ListNode node = new ListNode(i);
            previousNode.next = node;
            previousNode = node;
        }

        removeNthFromEnd(head, 2);
        ListNode.printList(head);
    }
}
