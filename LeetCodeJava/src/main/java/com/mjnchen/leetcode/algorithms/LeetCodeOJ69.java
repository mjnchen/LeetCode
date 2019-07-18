package com.mjnchen.leetcode.algorithms;

/**
 * Sqrt(x)
 * Created by jchen on 2/26/15.
 */

public class LeetCodeOJ69 {
    public int mySqrt(int x) {
        int left = 0;
        int right = (Math.pow(x / 2, 2) < Integer.MAX_VALUE) ? (x / 2 + 1) : (int) Math.sqrt(Integer.MAX_VALUE);

        while (left <= right) {
            int mid = (left + right) / 2;
            int sqr = mid * mid;
            if (sqr == x) {
                return mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (left + right) / 2;
    }
}
