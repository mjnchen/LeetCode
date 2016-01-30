/**
 * Created by jchen on 12/29/15.
 * 162. Find Peak Element
 */

public class LeetCodeOJ162 {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left, right;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                left = nums[i - 1];
            } else {
                left = Integer.MIN_VALUE;
            }
            if ( i < n - 1) {
                right = nums[i + 1];
            } else {
                right = Integer.MIN_VALUE;
            }
            if (nums[i] > left && nums[i] > right) {
                return i;
            }
        }
        return 0;
    }
}

