/**
 * Two Sum
 * Created by jchen on 2/26/15.
 */

import java.util.HashMap;

public class LeetCodeOJ1 {
    public int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2];
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         int index = map.get(nums[i]);
        //         result[0] = index + 1;
        //         result[1] = i + 1;
        //         break;
        //     } else {
        //         map.put(target - nums[i], i);
        //     }
        // }

        // return result;

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int index = map.get(target - nums[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
