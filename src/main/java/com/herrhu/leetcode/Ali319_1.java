package com.herrhu.leetcode;

/**
 * @description: 3.20 阿里笔试第一题
 *
 * 第一题：给定n(n为偶数)个人，规定每个人可以得到一个a[i]的序号，若抽到的序号是某个数字的平方，
 * 则获奖，现有一种修改券，可以使自己抽到的序号增减一，
 * 每个人可以使用多张，问最少需要多少张修改券可以使获奖人数为一半。
 *
 * 输入： 4              4 7 12 13
 * 输出 ： 2
 * 说明： 该序号数组中，4是2的2次幂，7需要两张修改券，所以至少需要两张
 * @time: 2021/3/20 23:28
 */
public class Ali319_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i ++) {
//            int temp = sc.nextInt();
//            nums[i] = get(temp);
//        }
        System.out.println(get(10));

    }

    public static int get(int x) {
        int l = 0, r = x, mid = (l + r + 1) >> 1;
        while (l < r) {
            if (mid * mid < x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        r = l + 1;
        return Math.min(x - l * l, r * r - x);
    }


}
