package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 12/29/15.
 * Maximum Product Subarray
 */

public class LeetCodeOJ152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = curMax;
            curMax = Math.max(Math.max(curMax * nums[i], curMin * nums[i]), nums[i]);
            curMin = Math.min(Math.min(curMin * nums[i], temp * nums[i]), nums[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }
}

