package main.java;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        ListNode a1 = new ListNode();
        a1.val = 6;
        ListNode a2 = new ListNode();
        a2.val = 4;
        a2.next = a1;
        ListNode a3 = new ListNode();
        a3.val = 0;
        a3.next = a2;
        ListNode a4 = new ListNode();
        a4.val = -3;
        a4.next = a3;

        ListNode b1 = new ListNode();
        b1.val = 9;
        ListNode b2 = new ListNode();
        b2.val = 5;
        b2.next = b1;
        ListNode b3 = new ListNode();
        b3.val = 1;
        b3.next = b2;
        ListNode listNode = mergeTwoLists(a4, b2);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    // Using extra variable
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        if (l1 == null) {
            result.next = l2;
        } else {
            result.next = l1;
        }
        return head.next;
    }

    // Using recursion
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val > l2.val)
            return mergeTwoLists2(l2, l1);
        l1.next = mergeTwoLists2(l1.next, l2);
        return l1;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
