package solution.linklist.medium;

import solution.linklist.ListNode;

public class AddTwoNumbers {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode prevNode = null;
        int carry = 0;
        ListNode l1Node = l1;
        ListNode l2Node = l2;
        while (l1Node != null || l2Node != null || carry > 0) {
            int l1val = l1Node != null ? l1Node.val : 0;
            int l2val = l2Node != null ? l2Node.val : 0;
            int sum = l1val + l2val;
            if (carry > 0) {
                sum += carry;
                carry = 0;
            }
            ListNode currentNode;
            if (sum >= 10) {
                currentNode = new ListNode(sum%10);
                carry = 1;
            }
            else {
                currentNode = new ListNode(sum);
            }
            if (prevNode != null) {
                prevNode.next = currentNode;
            }
            else {
                node = currentNode;
            }
            prevNode = currentNode;
            if (l1Node != null)
                l1Node = l1Node.next;
            if (l2Node != null)
                l2Node = l2Node.next;
        }

        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode node = addTwoNumbers(l1, l2);
        ListNode.printList(node);
    }
}
