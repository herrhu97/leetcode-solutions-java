package com.herrhu.leetcode;

import java.util.LinkedList;

public class Lc57 {
    public int[][] insert(int[][] a, int[] b) {
        LinkedList<int[]> res = new LinkedList<>();
        int k = 0;
        while (k < a.length && a[k][1] < b[0]) res.add(a[k ++]); //左边完全没交集的部分

        if(k < a.length) {
            b[0] = Math.min(b[0], a[k][0]);
            while (k < a.length && a[k][0] <= b[1]) b[1] = Math.max(b[1], a[k ++][1]);
        }
        res.add(b); //有交集的部分合成一个b，或者b无交集加入res中

        while (k < a.length) res.add(a[k ++]); //右边无交集的部分

        return res.toArray(new int[res.size()][2]);
    }
}
