package com.herrhu.leetcode;

/**
 * @description:
 * @author: HerrHu
 * @time: 2021/3/14 12:51
 */
public class Lc215 {
    //快排之快速选择
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSort(nums, 0, n - 1, n - k + 1);
    }

    public int quickSort(int[] nums, int l, int r, int k) {
        if (l >= r) {
            return nums[l];
        }

        int i = l - 1, j = r + 1, x = nums[(l + r) >> 1];

        while (i < j) {
            do {
                i ++;
            } while (nums[i] < x);

            do {
                j --;
            } while (nums[j] > x);

            if (i < j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int leftSize = j - l + 1;
        if (k <= leftSize) return quickSort(nums, l, j, k);
        else {
            return quickSort(nums, j + 1, r, k - leftSize);
        }
    }

    //堆
}
