package com.herrhu.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc102 {
    //本以为是bfs，是需要加上层数的信息
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0);
        return res;
    }

    void bfs(TreeNode root, int x) {
        if(root != null) {
            if(res.size() <= x) {
                res.add(new LinkedList<Integer>());
            }
            res.get(x).add(root.val);
            bfs(root.left, x + 1);
            bfs(root.right, x + 1);
        }
    }

    //y总bfs做法
    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root != null) {
            q.add(root);
        }

        while(q.size() > 0) {
            List<Integer> level = new LinkedList<>();
            int len = q.size();

            while(len -- > 0) {
                TreeNode t = q.poll();
                level.add(t.val);
                if(t.left != null) {
                    q.add(t.left);
                }
                if(t.right != null) {
                    q.add(t.right);
                }
            }

            res.add(level);
        }

        return res;
    }
}
