package com.herrhu.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Lc99 {
    List<TreeNode> res = new LinkedList<>();

    public void recoverTree(TreeNode root) {
        dfs(root);
        TreeNode a = null, b = null;
        for(int i = 0; i < res.size() - 1; i ++) {
            if(res.get(i).val > res.get(i + 1).val) {
                b = res.get(i + 1);
                if(a == null) {
                    a = res.get(i);
                }
            }
        }
        int t = a.val;
        a.val = b.val;
        b.val = t;
        return;
    }

    void dfs(TreeNode root) {
        if(root != null) {
            dfs(root.left);
            res.add(root);
            dfs(root.right);
        }
    }
}
