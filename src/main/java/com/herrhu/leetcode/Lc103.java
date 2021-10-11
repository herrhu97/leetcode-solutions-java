package com.herrhu.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();

        if(root != null) {
            q.add(root);
        }

        int cnt = 0;
        while(q.size() > 0) {
            List<Integer> level = new LinkedList<>();
            int len = q.size();

            while(len -- > 0) {
                TreeNode t = q.poll();
                level.add(t.val);//将该层的val都加入level中
                if(t.left != null) {
                    q.add(t.left);
                }
                if(t.right != null) {
                    q.add(t.right);
                }//把下一层的都加入q中
            }
            if(++ cnt % 2 == 0) {
                Collections.reverse(level);
            }
            res.add(level);
        }

        return res;
    }
}
