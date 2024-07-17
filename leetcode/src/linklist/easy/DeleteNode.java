package linklist.easy;

import linklist.ListNode;

public class DeleteNode {
    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        int i = 1;
        ListNode lastNode = head;
        ListNode deleteNode = null;
        while (++i < 6) {
            ListNode node = new ListNode(i);
            lastNode.next = node;
            lastNode = node;
            if (i == 3) {
                deleteNode = node;
            }
        }

        deleteNode(deleteNode);
        ListNode.printList(head);
    }
}
