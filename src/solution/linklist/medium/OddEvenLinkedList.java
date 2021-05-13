package solution.linklist.medium;

import solution.linklist.ListNode;

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode odd = head, even = odd.next, evenHead = odd.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        oddEvenList(l1);
        ListNode.printList(l1);
    }
}
