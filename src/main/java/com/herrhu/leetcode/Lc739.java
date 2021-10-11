package com.herrhu.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/13 21:51
 */
public class Lc739 {
    public int[] dailyTemperatures(int[] T) {
        // 单调栈类型
        int length = T.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < length; i ++) { //向后走
            int temp = T[i];
            while (!stack.isEmpty() && temp > T[stack.peek()]) { //向前走
                int prev = stack.pop();
                ans[prev] = i - prev;
            }
            stack.push(i);
        }
        return ans;
    }
}
