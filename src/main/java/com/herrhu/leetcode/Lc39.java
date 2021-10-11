package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc39 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] c, int target) {
        dfs(c, 0, target);
        return ans;
    }

    void dfs(int[] c, int u, int target) {
        if (target == 0) { //搜完了
            ans.add(new ArrayList(path));
            return;
        }

        if (u == c.length) return; //搜完了没找到

        for (int i = 0; c[u] * i <= target; i ++) {
            dfs(c, u + 1, target - c[u] * i);
            path.add(c[u]);
        }

        for (int i = 0; c[u] * i <= target; i ++) {
            path.remove(path.size() - 1);
        }
    }
}
