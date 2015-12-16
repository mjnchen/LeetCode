/**
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LeetCodeOJ39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        if(n==0){
            return result;
        }
        Arrays.sort(candidates);
        helper(result,candidates,target,0,temp);
        return result;
    }

    public void helper(List<List<Integer>> result, int[] candidates, int target, int pos, List<Integer> temp){
        if(target==0){
            List<Integer> temp0=new ArrayList<Integer>(temp);
            result.add(temp0);
            return;
        }
        if(target<0){
            return;
        }
        int n=candidates.length;
        for(int i=0;i<n;i++){
            if(i>=pos) {
                temp.add(candidates[i]);
                helper(result, candidates, target - candidates[i], i, temp);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
}
