package solution.linklist.easy;

import solution.linklist.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    static ListNode useStack(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack();
        ListNode node = head;
        while (node.next != null) {
            stack.push(node);
            node = node.next;
        }
        stack.push(node);
        ListNode reversed = stack.pop();
        node = reversed;
        while (!stack.empty()) {
            ListNode next = stack.pop();
            node.next = next;
            node = next;
        }
        node.next = null;
        return reversed;
    }

    static ListNode useIterator(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next; //store next to temp
            current.next = prev; //set current next to prev for reversion
            prev = current;
            current = temp; //go next
        }
        return prev;
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

        ListNode rever = useIterator(head);
        ListNode.printList(rever);
    }
}
