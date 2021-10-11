package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 20:27
 */
public class Lc160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // a ..... b .... c
        // d ..... b .... c
        // 这样走，p ab + bc + db距离 q db + bc + ab距离
        ListNode p = headA, q = headB;

        while (p != q) {
            p = p != null ? p.next : headB;
            q = q != null ? q.next : headA;
        }
        return p;
    }
}
