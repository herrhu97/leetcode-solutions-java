package com.herrhu.leetcode;

import java.util.LinkedList;

public class Lc66 {
    public int[] plusOne(int[] digits) {
        int t = 1, i = digits.length -  1;
        LinkedList<Integer> res = new LinkedList<>();

        while(i >= 0 || t != 0) {
            if(i >= 0) {
                t += digits[i --];
            }
            res.add(t % 10);
            t /= 10;
        }
        int[] res2 = new int[res.size()];
        for(int j = 0; j < res.size(); j ++) {
            res2[j] = res.get(res.size() - 1 - j);
        }
        return res2;
    }
}
