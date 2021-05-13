package solution.linklist.medium;

import solution.linklist.ListNode;

public class IntersectionTwoList {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        while (nodeA != null) {
            ListNode nodeB = headB;
            while (nodeB != null) {
                if (nodeA.equals(nodeB)) {
                    return nodeB;
                }
                nodeB = nodeB.next;
            }
            nodeA = nodeA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersection;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = getIntersectionNode(headA, headB);
        ListNode.printList(result);
    }
}
