package com.herrhu.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class Lc56 {
    /*
    模板题
     */
    public int[][] merge(int[][] a) {
        Arrays.sort(a, (o1, o2) -> {return o1[0] - o2[0];});
        LinkedList<int[]> stack = new LinkedList<>();

        for(int[] arr : a) {
            if(!stack.isEmpty() && arr[0] <= stack.peekLast()[1])
                stack.peekLast()[1] = Math.max(stack.peekLast()[1], arr[1]);
            else stack.add(arr);
        }

        return stack.toArray(new int[stack.size()][2]);
    }
}
