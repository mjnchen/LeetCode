package com.mjnchen.leetcode.algorithms;

/**
 * Multiply Strings
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCodeOJ43 {
    public String multiply(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        int m = num1.length();
        int n = num2.length();

        int d = m + n;

        int[] temp = new int[d];
        for(int i = 0; i < m; i++){
            int a = num1.charAt(i) - '0';
            for(int j = 0; j < n; j++){
                int b = num2.charAt(j) - '0';
                temp[i+j] += a * b;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int h = 0; h < d; h++){
            int digit = temp[h] % 10;
            int mod = temp[h] / 10;
            result.insert(0, digit);
            if( h + 1 < d){
                temp[h+1] += mod;
            }
        }

        // trimming starting zeros
        while(result.length() > 0 && result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }

        if(result.length() == 0){
            return "0";
        }else{
            return result.toString();
        }
    }
}
