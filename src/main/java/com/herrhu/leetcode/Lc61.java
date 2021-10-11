package com.herrhu.leetcode;

public class Lc61 {
    /*
    对一些边界情况的判别
    */
    public ListNode rotateRight(ListNode head, int k) {
        //准备工作，整理k，获取链表长度count
        if(k == 0 || head == null) return head;
        ListNode temp = head;
        int count = 1;
        while(temp.next != null) {
            temp = temp.next;
            count ++;
        }
        if(count == 1) return head;
        if(k > count) k = k % count;
        if(k == 0) return head;

        //构造虚拟头结点
        ListNode pseudoHead = new ListNode(-1);
        pseudoHead.next = head;

        temp = head; //temp指向第一部分首元素
        ListNode cur = head; //cur指向第二部分首元素
        for(int i = 0; i < count - k; i ++) {
            cur = cur.next;
        }

        //第一部分放后面，第二部分放前面
        pseudoHead.next = cur;
        while(cur.next != null) {
            cur = cur.next; // cur指向尾结点
        }

        cur.next = temp;
        while(temp.next != pseudoHead.next) {
            temp = temp.next;
        }
        temp.next = null;

        return pseudoHead.next;
    }
}
