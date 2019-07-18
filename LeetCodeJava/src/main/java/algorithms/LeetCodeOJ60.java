package com.mjnchen.leetcode.algorithms;

/**
 * Permutation Sequence
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCodeOJ60 {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        List<Integer> numberList = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            numberList.add(i+1);
        }

        // An integer vector to store factorials, fact[i] = i!
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i = 1; i < n; i++){
            fact[i] = fact[i-1] * i;
        }

        for(int j = n-1; j >= 0; j--){

            int mod = (k-1) / fact[j];
            sb.append(numberList.get(mod));
            numberList.remove(mod);
            k -= fact[j] * mod;

        }
        return sb.toString();
    }
}
