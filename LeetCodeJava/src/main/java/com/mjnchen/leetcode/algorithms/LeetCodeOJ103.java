package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 2/26/15.
 * Binary Tree Zigzag Level Order Traversal
 */

import com.mjnchen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h = getHeight(root);
        if (h == 0) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        for (int i=1;i<=h;i++) {
            if(i%2 == 0 ){
                result.add(reverseList(zigzagGivenLevel(root, i)));
            } else {
                result.add(zigzagGivenLevel(root, i));
            }
        }
        return result;
    }
    public List<Integer> zigzagGivenLevel(TreeNode root, int level) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> resultLevel = new ArrayList<Integer>();
        if (level == 1) {
            resultLevel.add(root.val);
        } else if (level >1) {
            resultLevel.addAll(zigzagGivenLevel(root.left, level-1));
            resultLevel.addAll(zigzagGivenLevel(root.right, level-1));
        }
        return resultLevel;
    }
    private List<Integer> reverseList(List<Integer> myList) {
        List<Integer> invertedList = new ArrayList<Integer>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            invertedList.add(myList.get(i));
        }
        return invertedList;
    }
    public int getHeight(TreeNode root){
        if (root == null) {
            return 0;
        } else {
            return Math.max(getHeight(root.left),getHeight(root.right))+1;
        }
    }
}
