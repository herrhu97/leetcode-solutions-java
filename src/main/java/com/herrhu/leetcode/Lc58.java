package com.herrhu.leetcode;

public class Lc58 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i --) {
            if(s.charAt(i) == ' ') continue;
            int j = i - 1;
            while(j >= 0 && s.charAt(j) != ' ') j --;
            res = i - j;
            return res;
        }
        return res;
    }
}
