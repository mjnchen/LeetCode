package com.mjnchen.leetcode.algorithms;

/**
 * Divide Two Integers
 * Created by jchen on 8/16/15.
 */

public class LeetCodeOJ29 {
    public int divide(int dividend, int divisor) {
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }
        if(divisor == 1){
            return dividend;
        }
        if(divisor == -1 && dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }

        // int absDividend = Math.abs(dividend);
        // int absDivisor = Math.abs(divisor);

        // int quotient = 0;
        // while(absDividend >= absDivisor){
        //     quotient++;
        //     absDividend-=absDivisor;
        // }

        // if(dividend >= 0 && divisor > 0){
        //     return quotient;
        // }else if(dividend < 0 && divisor < 0){
        //     return quotient;
        // }else if(divisor < 0){
        //     return -quotient;
        // }else{
        //     return -quotient - 1;
        // }

        // another version
        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        int quotient =0;
        while(absDividend >= absDivisor){
            int numShift = 0;
            while(absDividend >= (absDivisor << numShift)){
                numShift++;
            }
            quotient += (1 << (numShift - 1));
            absDividend -= (absDivisor << (numShift - 1));
        }
        if(dividend >= 0 && divisor > 0){
            return quotient;
        }else if(dividend < 0 && divisor < 0){
            return quotient;
        }else if(divisor < 0){
            return -quotient;
        }else{
            return -quotient;
        }
    }
}
