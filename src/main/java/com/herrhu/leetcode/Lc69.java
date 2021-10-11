package com.herrhu.leetcode;

public class Lc69 {
    /*
    满足y^2 <= x 最大的y值
    牢记二分模板
    */
    public int mySqrt(int x) {
        int l = 0, r = x;
        while(l < r) {
            int mid = (int)(l + 1l + r >> 1);
            if(mid <= x / mid) l = mid;
            else r = mid - 1;
        }
        return l;
    }
}
