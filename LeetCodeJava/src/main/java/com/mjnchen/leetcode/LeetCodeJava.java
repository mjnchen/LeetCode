package com.mjnchen.leetcode;

import com.mjnchen.leetcode.algorithms.*;
import com.mjnchen.leetcode.utils.BinomialCoefficient;
import com.mjnchen.leetcode.utils.ListNode;

/**
 * Created by mjnchen on 7/17/19.
 */
public class LeetCodeJava {
    public static void main(String[] args) {

//         // Testing codes corresponding to foundations of Java:
//        int x = -1;
//        System.out.println(x>>1);  // The value of 'x>>>29' is 00...0111
//        System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111
//        System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011
//        System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001
//
//        final int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {10, 20, 30, 40, 50};
//        arr2 = arr1;
//        // arr1 = arr2;
//        for (int i = 0; i < arr2.length; i++)
//            System.out.println(arr2[i]);
//
//        return;

         int result = BinomialCoefficient.binomialCoefficient(4,2);
         System.out.println(result);

         int a = -7;
         int b = -3;
         int c = a / b;
         int d = a % b;
         System.out.println(d); // 5 mod -2 is 1
    }
}
