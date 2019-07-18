package com.mjnchen.leetcode.algorithms;

/**
 * Decode Ways
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ91 {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0 || s.equals("0")){
            return 0;
        }

        int[] count = new int[s.length() + 1];
        count[0] = 1;

        if(isValid(s.substring(0, 1))){
            count[1] = 1;
        }else{
            count[1] = 0;
        }

        for(int i = 2; i <= s.length(); i++){
            if(isValid(s.substring(i - 1, i))){
                count[i] += count[i - 1];
            }

            if(isValid(s.substring(i - 2, i))){
                count[i] += count[i - 2];
            }
        }

        return count[s.length()];
    }

    public boolean isValid(String s){
        if(s.charAt(0) == '0'){
            return false;
        }

        int val = Integer.parseInt(s);

        return val >= 1 && val <= 26;
    }
}
