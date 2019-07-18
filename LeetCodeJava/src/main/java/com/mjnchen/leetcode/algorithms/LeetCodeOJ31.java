package com.mjnchen.leetcode.algorithms;

/**
 * Next Permutation
 * Created by jchen on 8/16/15.
 */

public class LeetCodeOJ31 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1){
            return;
        }

        int vioIndex = 0;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                vioIndex = i;
                break;
            }
        }

        int chgIndex = 0;
        for(int j = nums.length - 1; j > vioIndex; j--){
            if(nums[vioIndex] < nums[j]){
                chgIndex = j;
                break;
            }
        }

        if(vioIndex == 0 && chgIndex == 0){
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int temp = nums[vioIndex];
        nums[vioIndex] = nums[chgIndex];
        nums[chgIndex] = temp;
        reverse(nums, vioIndex + 1, nums.length - 1);

        return;
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }
}
