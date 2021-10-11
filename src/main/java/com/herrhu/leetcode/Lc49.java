package com.herrhu.leetcode;

import java.util.*;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 10:02
 */
public class Lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        //利用hash的思想来做，主要在于如何确定字符异构词的hash值，用排序好的String当key
        List<List<String>> ans = new LinkedList();
        Map<String, List<String>> hashmap = new HashMap();
        for (String s: strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String nStr = String.valueOf(arr);

            if(!hashmap.containsKey(nStr)) {
                List<String> list  = new LinkedList();
                list.add(s);
                hashmap.put(nStr, list);
            } else {
                List<String> list = hashmap.get(nStr);
                list.add(s);
            }
        }

        for(Map.Entry<String, List<String>> entry : hashmap.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;

    }
}
