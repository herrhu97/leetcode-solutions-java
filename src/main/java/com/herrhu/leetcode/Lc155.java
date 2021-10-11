package com.herrhu.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 20:14
 */
public class Lc155 {
    //类似于前缀和思想，前缀最小值数组
    Stack<Integer> stack;
    List<Integer> list;

    /** initialize your data structure here. */
    public Lc155() {
        stack = new Stack();
        list = new LinkedList();
        list.add(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        int size = list.size();
        int minv = Math.min(list.get(size - 1), val);
        list.add(minv);
    }

    public void pop() {
        stack.pop();
        list.remove(list.size() - 1);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return list.get(list.size() - 1);
    }
}
