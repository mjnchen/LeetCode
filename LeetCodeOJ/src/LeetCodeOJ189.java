/**
 * Created by jchen on 12/29/15.
 * 189. Rotate Array
 */

public class LeetCodeOJ189 {
    public void rotate(int[] nums, int k) {
        /*
        // Solution 1: Bubble Rotate
        int n = nums.length;
        k = k % n; // Reduce computational cost
        int temp;
        for (int i = n - k - 1; i >= 0; i--) {
            for (int j = 0; j <= k - 1; j++) {
                // Swap nums[i + j] with nums[i + j  + 1]
                temp = nums[i + j];
                nums[i + j] = nums[i + j + 1];
                nums[i + j + 1] = temp;
            }
        }
        return;
        */

        // Solution 2:
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        if (k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, n - k - 1);
        reverseArray(nums, n - k, n - 1);
        reverseArray(nums, 0, n - 1);
        return;
    }

    public void reverseArray(int[] nums, int left, int right) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int temp;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return;
    }
}

