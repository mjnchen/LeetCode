package com.mjnchen.leetcode.algorithms;

/**
 * Longest Substring Without Repeating Characters
 * Created by jchen on 2/26/15.
 */

public class LeetCodeOJ5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 0 || len == 1){
            return s;
        }

        // Use boolean matrix to remember Palindrome substrings
        boolean[][] isPalindrome = new boolean[len][len];
        // start: beginning index of longest Palindrome
        int start=0, maxLength=0;

        for(int i=0;i < len;i++){
            isPalindrome[i][i] = true;
        }

        for(int j=0;j < len-1;j++){
            if(s.charAt(j) == s.charAt(j+1)){
                isPalindrome[j][j+1] = true;
                start = j;
                maxLength = 2;
            }
        }

        for(int k=3;k<=len;k++){
            for(int i=0; i<len-k+1; i++){
                int j=i+k-1;
                if(s.charAt(i)==s.charAt(j) && isPalindrome[i+1][j-1]==true){
                    isPalindrome[i][j] = true;
                    if(k>maxLength){
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        return s.substring(start, start+maxLength);
    }
}
