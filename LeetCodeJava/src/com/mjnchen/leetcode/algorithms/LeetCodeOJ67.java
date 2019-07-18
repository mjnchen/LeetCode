package com.mjnchen.leetcode.algorithms;

/**
 * Add Binary
 * Created by jchen on 2/26/15.
 */

public class LeetCodeOJ67 {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0){
            return b;
        }
        if(b == null || b.length() == 0){
            return a;
        }

        int carry = 0;
        StringBuilder result = new StringBuilder();
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--){
            int ai = (i >= 0) ? (a.charAt(i) - '0'): 0;
            int bj = (j >= 0) ? (b.charAt(j) - '0'): 0;

            int sum = ai + bj + carry;

            int value = sum % 2;
            carry = sum / 2;
            result.insert(0, String.valueOf(value));
        }

        if(carry == 1){
            result.insert(0, String.valueOf(1));
        }
        return result.toString();
    }
}
