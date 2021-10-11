package com.herrhu.leetcode;
/*
  一道经典的整数二分问题
*/

public class Lc34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};//特判输入为空

        int res1 = binarySearch1(nums, target, 0, nums.length - 1);//找左边界
        if(nums[res1] != target) return new int[]{-1, -1};//特判没找到

        int res2 = binarySearch2(nums, target, 0, nums.length - 1);//找有边界

        return new int[]{res1, res2};
    }

    int binarySearch1(int[] nums, int target, int l, int r) {
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] >= target) r = mid; //满足此性质的区间的左边界
            else l = mid + 1;
        }
        return l;
    }

    int binarySearch2(int[] nums, int target, int l, int r) {
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (nums[mid] <= target) l = mid; //满足此性质的区间的右边界
            else r = mid - 1;
        }
        return l;
    }
}
