package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 12/29/15.
 * 169. Majority Element
 */
import java.util.HashMap;
public class LeetCodeOJ169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Integer temp = new Integer(nums[i]);
            if (numCount.containsKey(temp)) {
                numCount.put(temp, numCount.get(temp) + 1);
            } else {
                numCount.put(temp, new Integer(1));
            }

            int tempCount = numCount.get(temp).intValue();
            if (tempCount > n / 2) {
                return temp.intValue();
            }
        }
        return 0;
    }
}

