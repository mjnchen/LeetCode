/**
 * 4Sum
 * Created by jchen on 8/16/15.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class LeetCodeOJ18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int k = j + 1;
                int h = nums.length - 1;
                while(k < h){
                    int sum = nums[i] + nums[j] +nums[k] + nums[h];
                    if(sum == target){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[h]);
                        if(!hashSet.contains(temp)) {
                            result.add(temp);
                            hashSet.add(temp);
                        }
                        k++;
                        h--;
                    }else if(sum < target){
                        k++;
                    }else{
                        h--;
                    }
                }
            }
        }
        return result;
    }
}
