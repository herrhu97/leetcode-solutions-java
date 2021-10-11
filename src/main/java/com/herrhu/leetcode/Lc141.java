package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 12:14
 */
public class Lc141 {
    public boolean hasCycle(ListNode head) {
        //基础做法：基础开个哈希表存储已遍历过的结点·
        //快慢指针
        if(head == null || head.next == null) {
            return false;
        }

        ListNode s = head, f = head.next;

        while (f != null) {
            s = s.next;
            f = f.next;
            if (f == null) {
                return false;
            }
            f = f.next;
            if (s == f) return true;
        }
        return false;
    }
}
