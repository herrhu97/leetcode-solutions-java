package com.herrhu.leetcode;

public class Lc206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode pseudoHead = new ListNode(-1);
        ListNode temp = head;
        ListNode tail = null;
        while(temp != null) {
            pseudoHead.next = temp;
            temp = temp.next;
            pseudoHead.next.next = tail;
            tail = pseudoHead.next;
        }

        return pseudoHead.next;
    }
}
