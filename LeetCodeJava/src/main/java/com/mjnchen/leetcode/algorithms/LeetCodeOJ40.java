package com.mjnchen.leetcode.algorithms;

/**
 * Combination Sum II
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class LeetCodeOJ40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        if(n==0){
            return result;
        }
        Arrays.sort(candidates);
        dfs(result, temp, candidates, 0, target);

        HashSet<List<Integer>> set = new HashSet<List<Integer>>(result);

        //remove duplicate lists
        result.clear();
        result.addAll(set);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> temp, int[] candidates, int start, int target){
        if(target == 0){
            result.add(new ArrayList<Integer>(temp));
        }

        if(target <0 || start >= candidates.length){
            return;
        }

        int n=candidates.length;
        for(int i=0;i<n;i++){
            if(i>=start) {
                temp.add(candidates[i]);
                dfs(result, temp, candidates, i + 1, target - candidates[i]);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
}
