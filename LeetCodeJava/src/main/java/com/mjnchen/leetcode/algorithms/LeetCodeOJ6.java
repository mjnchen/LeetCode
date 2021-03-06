package com.mjnchen.leetcode.algorithms;

/**
 * ZigZag Conversion
 * Created by jchen on 8/10/15.
 */
public class LeetCodeOJ6 {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows <= 0){
            return "";
        }
        if(numRows == 1){
            return s;
        }
        StringBuilder result = new StringBuilder();
        int size = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < s.length(); j+=size){
                result.append(s.charAt(j));
                if(i != 0 && i!= numRows - 1 && j + size - 2 * i < s.length()){
                    result.append((s.charAt(j + size - 2 * i)));
                }
            }
        }
        return result.toString();
    }
}
