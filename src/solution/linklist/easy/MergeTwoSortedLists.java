package solution.linklist.easy;

public class MergeTwoSortedLists {

    static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode merged; //merged head
        if (l1.val < l2.val) {
            merged = l1;
            merged.next = merge(l1.next, l2);
        }
        else {
            merged = l2;
            merged.next = merge(l1, l2.next);
        }
        return merged;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l4;

        ListNode r1 = new ListNode(1);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(4);
        r1.next = r3;
        r3.next = r4;

        ListNode merged = merge(l1, r1);
        ListNode.printList(merged);
    }
}
