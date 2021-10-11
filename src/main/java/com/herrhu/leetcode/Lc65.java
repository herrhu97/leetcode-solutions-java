package com.herrhu.leetcode;

public class Lc65 {
    /*
    面向数据编程
    没什么意思
    */
    public boolean isNumber(String s) {
        s = s.trim();
        try {
            Double.valueOf(s);
            if(s.charAt(s.length()-1) == 'f' || s.charAt(s.length()-1) == 'D') {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
