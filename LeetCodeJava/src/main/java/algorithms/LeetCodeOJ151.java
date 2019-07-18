package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 12/29/15.
 * Reverse Words in a String
 */
import java.util.Stack;

public class LeetCodeOJ151 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        boolean head = false, tail = false;
        if (s.charAt(0) == ' ') {
            head = true;
        }
        if (s.charAt(s.length() - 1) == ' ') {
            tail = true;
        }

        // Remove leading and trailing spaces
        String sTrim = s.trim();
        String[] strArray = sTrim.split("\\s+");

        StringBuilder res = new StringBuilder();
        // if (tail) {
        //     res.append(" ");
        // }
        for (int i = strArray.length - 1; i >= 0; i--) {
            res.append(strArray[i]);
            if ( i != 0) {
                res.append(" ");
            }
        }
        // if (head) {
        //     res.append(" ");
        // }

        return res.toString();
    }
}

