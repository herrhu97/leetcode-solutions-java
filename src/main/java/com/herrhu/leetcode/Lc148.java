package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 18:53
 */
public class Lc148 {
    public ListNode sortList(ListNode head) {
        //快速排序链表写法
        if(head == null || head.next == null) return head;

        //快慢指针找中点
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        int val = s.val;

        ListNode L = new ListNode(-1);
        ListNode R = new ListNode(-1);
        ListNode Mid = new ListNode(-1);
        //将链表分为三段
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val == val) insert(Mid, head);
            else if (head.val > val) insert(R, head);
            else insert(L, head);
            head = next;
        }

        ListNode newL = sortList(L.next);
        ListNode newR = sortList(R.next);
        //合并
        ListNode dummy = new ListNode(-1);
        dummy.next = newL;
        ListNode cur = dummy;
        while(cur.next != null) cur = cur.next;
        cur.next = Mid.next;
        while(cur.next != null) cur = cur.next;
        cur.next = newR;

        return dummy.next;

    }

    //头插法
    void insert(ListNode p, ListNode q) {
        q.next = p.next;
        p.next = q;
    }
}
