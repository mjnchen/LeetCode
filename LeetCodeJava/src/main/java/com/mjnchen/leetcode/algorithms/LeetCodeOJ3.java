package com.mjnchen.leetcode.algorithms;

/**
 * Longest Substring Without Repeating Characters
 * Created by jchen on 2/26/15.
 */

import java.util.*;

public class LeetCodeOJ3 {
    public int lengthOfLongestSubstring(String s) {
        // Time out issue.
        // int n = s.length();
        // if(n == 0){
        //     return 0;
        // }else if(n == 1){
        //     return 1;
        // }
        // int result = Integer.MIN_VALUE; // initialize result;
        // for(int i=0; i<n; i++){
        //     HashMap<String, Integer> temp = new HashMap<String, Integer>();
        //     for(int j=i; j<n; j++){
        //         if(temp.containsKey(s.substring(j, j+1))){
        //             break;
        //         }
        //         temp.put(s.substring(j, j+1), 1);
        //         if(j-i+1 > result){
        //             result = j-i+1;
        //         }
        //     }
        //     temp.clear();
        // }
        // return result;

        // Another version:
        int n = s.length();
        if(n == 0 || n == 1){
            return n;
        }

        // countTable is used to store each char's last seen position.
        int[] countTable = new int[256];
        Arrays.fill(countTable, -1);

        int result = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        while(end < n){
            // Has reached a duplicate.
            if(countTable[s.charAt(end)] >= start){
                start = countTable[s.charAt(end)] + 1;
            }

            result = Math.max(end - start + 1, result);
            countTable[s.charAt(end)] = end;
            end++;
        }

        return result;
    }
}
