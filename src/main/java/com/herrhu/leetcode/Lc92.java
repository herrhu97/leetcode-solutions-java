package com.herrhu.leetcode;

public class Lc92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //做链表题一般要画图，也要虚拟头节点dummy
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode a = dummy, b = null, c = null, t = null;
        for(int i = 0; i < m - 1; i ++) {
            a = a.next;
        }

        b = a.next; // b c 区间不断改变箭头方向
        c = b.next;

        for(int i = 0; i < n - m; i ++) {
            t = c.next;
            c.next = b;

            b = c;
            c = t;
        }
        a.next.next = c;
        a.next = b;

        return dummy.next;
    }
}
