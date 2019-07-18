package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 12/29/15.
 * Evaluate Reverse Polish Notation
 */
import java.util.Stack;
public class LeetCodeOJ150 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> numbers = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            String temp = tokens[i];
            if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                Integer a = numbers.pop();
                Integer b = numbers.pop();
                Integer c = new Integer(0);
                if (temp.equals("+")) {
                    c = a + b;
                } else if (temp.equals("-")) {
                    c = b - a;
                } else if (temp.equals("*")) {
                    c = a * b;
                } else if (temp.equals("/")) {
                    c = b / a;
                }
                numbers.add(c);
            } else {
                Integer val = Integer.valueOf(temp);
                numbers.add(val);
            }
        }

        Integer res = numbers.pop();
        return res.intValue();
    }
}

