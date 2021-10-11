package com.herrhu.leetcode;

public class Lc60 {
    /*
    第一次遇到需要优化时间复杂度的 o(k)
    测试用例为
    9
    278621
    */

    boolean[] flag;
    int count = 0;
    int key = 0;

    public String getPermutation(int n, int k) {
        flag = new boolean[n + 1];
        dfs(1, new StringBuilder(), n, k);

        return String.valueOf(key);
    }

    public void dfs(int x, StringBuilder path, int n, int k) {
        if (x == n + 1) {
            count ++;
            if(count == k) { //找到第k个排列马上返回
                key = Integer.parseInt(path.toString());
                return;
            }
        }

        if(key != 0) return; //已经找到之后结束后面的暴搜

        for (int i = 1; i <= n; i ++) {
            if (!flag[i]) {
                path.append(i);
                flag[i] = true;
                dfs(x + 1, path, n, k);
                path.deleteCharAt(path.length() - 1);
                flag[i] = false;
            }
        }
    }
}
