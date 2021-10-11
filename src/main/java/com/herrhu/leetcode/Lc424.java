package com.herrhu.leetcode;

class Lc424 {
    public int characterReplacement(String s, int k) {
        //右边界先移动找到一个满足题意的可以替换 k 个字符以后，所有字符都变成一样的当前看来最长的子串，直到右边界纳入一个字符以后，不能满足的时候停下；
        //然后考虑左边界向右移动，左边界只须要向右移动一格以后，右边界就又可以开始向右移动了，继续尝试找到更长的目标子串；
        //替换后的最长重复子串就产生在右边界、左边界交替向右移动的过程中。


        int n = s.length();
        if (n < 2) {
            return n;
        }

        char[] arr = s.toCharArray();
        int[] f = new int[26];
        int maxCount = 0; //区间内最大的字符数量

        int left = 0;
        int right = 0;
        //[left, right) 内最多替换k个字符可以得到只有一种字符的子串
        while (right < n) {
            f[arr[right] - 'A'] ++;
            maxCount = Math.max(maxCount, f[arr[right] - 'A']);
            right++;

            if (right - left > maxCount + k) {
                f[arr[left] - 'A'] --;
                left ++;
            }
        }
        return right - left;
    }
}
