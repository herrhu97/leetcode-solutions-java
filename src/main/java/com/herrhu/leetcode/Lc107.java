package com.herrhu.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc107 {
    //与102题类似，注意List如何reverse
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root != null) {
            q.add(root);
        }

        while(q.size() > 0) {
            int len = q.size(); //当前这一层的容量
            List<Integer> level = new LinkedList<>();

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
        Collections.reverse(res);

        return res;
    }
}
