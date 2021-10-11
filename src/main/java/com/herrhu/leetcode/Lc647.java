package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/13 21:58
 */
public class Lc647 {
    public int countSubstrings(String s) {
        //回文子串，中心扩展法
        int n = s.length() * 2 - 1;
        int ans = 0;

        for (int i = 0; i < n; i ++) {
            int l = i / 2, r = i % 2 + l;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l --;
                r ++;
                ans ++;
            }
        }
        return ans;
    }
}
