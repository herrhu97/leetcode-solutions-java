package com.herrhu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc46 {
    /*
    多在本地构建更多不同的测试用例，特别是那种极端情况、边界情况         
    dfs暴搜 = 递归（递归终止条件） + for（回溯）
    */

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList();
    boolean[] flag;

    public List<List<Integer>> permute(int[] nums) {
        flag = new boolean[nums.length + 10];
        dfs(nums, 0);
        return ans;
    }

    public void dfs(int[] nums, int u) {
        if(u == nums.length) {
            ans.add(new ArrayList(path));
            return;
        };

        for(int i = 0; i < nums.length; i ++) {
            if(flag[i] == false) {
                path.add(nums[i]);
                flag[i] = true;
                dfs(nums, u + 1);
                flag[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
