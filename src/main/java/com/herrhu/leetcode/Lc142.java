package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 12:56
 */
public class Lc142 {
    public ListNode detectCycle(ListNode head) {
        //快慢指针 在相遇点再走x步，回退到b点
        // a......b（入环点）.......c（相遇点）........c1（b点回退y距离的点）........b
        // b到c 距离y
        // c1到b 距离y
        if(head == null || head.next == null) {
            return null;
        }
        ListNode f = head.next;
        ListNode s = head;

        int k = 0;
        while (f != null) {
            s = s.next;
            f = f.next;
            k ++;
            if (f != null) {
                f = f.next;
            }
            if(s == f) {
                s = head;
                // k = k - 1;
                f = f.next;
                while (s != f) {
                    f = f.next;
                    s = s.next;
                }
                return f;
            }
        }
        return null;
    }
}
