package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 05/15/15.
 * Palindrome Partitioning
 */
import java.util.ArrayList;
import java.util.List;
public class LeetCodeOJ131 {
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<List<String>>();
        if(n == 0){
            return result;
        }
        List<String> temp = new ArrayList<String>();
        helper(result, temp, s, 0);
        return result;
    }
    public void helper(List<List<String>> result, List<String> temp, String s, int start){
        if(start == s.length()){
            result.add(new ArrayList<String>(temp));
        }
        for(int i = start; i<s.length(); i++){
            if(isPalindrome(s, start, i)){
                temp.add(s.substring(start, i+1)); // substring method the endIndex is exclusive
                helper(result, temp, s, i + 1);
                temp.remove(temp.size() - 1); // backtracking
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
