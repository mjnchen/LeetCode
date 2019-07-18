package com.mjnchen.leetcode.algorithms;

/**
 * Longest Common Prefix
 * Created by jchen on 8/16/15.
 */
public class LeetCodeOJ14 {
    public String longestCommonPrefix(String[] strs) {
        int numStrs = strs.length;
        if(strs == null || numStrs ==0){
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for(String str : strs){
            if(str.length() < minLen){
                minLen = str.length();
            }
        }
        for(int j = 0; j < minLen; j++){
            char prev = '\0'; // null char literal
            for(int i = 0; i < numStrs; i++){
                if(i == 0){
                    prev = strs[i].charAt(j);
                    continue;
                }
                if(strs[i].charAt(j) != prev){
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}
