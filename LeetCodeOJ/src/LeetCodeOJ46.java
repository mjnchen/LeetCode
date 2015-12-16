/**
 * Permutations
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        dfs(result, temp, nums, visited, 0);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] visited, int step) {
        if(step == nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == false){
                temp.add(nums[i]);
                visited[i] = true;
                dfs(result, temp, nums, visited, step + 1);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }

        }
    }
}
