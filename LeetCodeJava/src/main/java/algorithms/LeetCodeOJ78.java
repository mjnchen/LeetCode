package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 2/26/15.
 */
import java.util.*;
public class LeetCodeOJ78 {
    public List<List<Integer>> subsets(int[] S){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(S.length==0){
            return result;
        }
        if(S.length==1){
            List<Integer> empty=new ArrayList<Integer>();
            List<Integer> temp=new ArrayList<Integer>();
            temp.add(S[0]);
            result.add(empty);
            result.add(temp);
            return result;
        }
        Arrays.sort(S);
        int[] S_prev=new int[S.length-1];
        System.arraycopy(S, 0, S_prev, 0, S.length - 1);
        List<List<Integer>> prev=subsets(S_prev);
        List<List<Integer>> prev_copy=subsets(S_prev);
        result=new ArrayList<List<Integer>>(prev_copy);
        int extra=S[S.length-1];
        for(int i=0;i<prev.size();i++){
            List<Integer> temp=prev.get(i);
            temp.add(extra);
        }
        result.addAll(prev);
        return result;
    }
}
