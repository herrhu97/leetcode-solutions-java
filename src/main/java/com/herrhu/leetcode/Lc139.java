package com.herrhu.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/20 11:55
 */
public class Lc139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        //以单词为单位，定义j切割点
        //dp[i] 表示前i个字符是否能被单词表中的单词组成
        //状态转移方程 dp[i] = dp[j] && set.contains(s.substring(j, i))
        Set<String> set = new HashSet();
        for (String str : wordDict) {
            set.add(str);
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i ++) {
            for (int j = 0; j < i; j ++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];
    }
}
