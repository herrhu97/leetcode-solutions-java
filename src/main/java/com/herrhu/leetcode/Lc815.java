package com.herrhu.leetcode;

import java.util.*;

class Lc815 {
    public int numBusesToDestination(int[][] routes, int s, int t) {
        if(s == t) {
            return 0;
        }
        int m = routes.length;
        List<List<Integer>> arr = new ArrayList();
        for (int i = 0; i < m; i ++) {
            Arrays.sort(routes[i]);
            arr.add(new ArrayList());
        }


        for (int i = 0; i < m - 1; i ++) {
            for (int j = i + 1; j < m; j ++) {
                if(find(routes[i], routes[j])) {
                    arr.get(i).add(j);
                    arr.get(j).add(i);
                }
            }
        }

        Set<Integer> seen = new HashSet();
        Set<Integer> target = new HashSet();
        Queue<Node> queue = new ArrayDeque();
        for (int i = 0; i < m; i ++) {
            if (Arrays.binarySearch(routes[i], s) >= 0) {
                seen.add(i);
                queue.offer(new Node(i, 0));
            }

            if (Arrays.binarySearch(routes[i], t) >= 0) {
                target.add(i);
            }
        }

        while(!queue.isEmpty()) {
            Node info = queue.poll();
            int val = info.x, length = info.y;
            if(target.contains(val)) {
                return length + 1;
            }
            for (Integer i : arr.get(val)) {
                if (!seen.contains(i)) {
                    seen.add(i);
                    queue.offer(new Node(i, length + 1));
                }
            }
        }
        return -1;
    }

    public boolean find(int[] m, int[] n) {
        for (int i = 0, j = 0; i < m.length && j < n.length; ) {
            if (m[i] == n[j]) {
                return true;
            } else {
                if (m[i] > n[j]) {
                    j ++;
                } else {
                    i ++;
                }
            }
        }
        return false;
    }
}

class Node {
    int x;
    int y;
    public Node (int x, int y) {
        this.x = x;
        this.y = y;
    }
}