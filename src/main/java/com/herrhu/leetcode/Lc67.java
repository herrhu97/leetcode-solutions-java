package com.herrhu.leetcode;

public class Lc67 {
    public String addBinary(String a, String b) {
        int t = 0, i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || t != 0) {
            if(i >= 0) {
                int temp = a.charAt(i --) == '1' ? 1 : 0;
                t += temp;
            }
            if(j >= 0) {
                int temp = b.charAt(j --) == '1' ? 1 : 0;
                t += temp;
            }
            sb.append(t % 2);
            t /= 2;
        }
        return sb.reverse().toString();
    }
}
