package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 2/26/15.
 * Binary Tree Zigzag Level Order Traversal
 */

import com.mjnchen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeOJ105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=buildTree(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd){
        if (inorder.length != preorder.length )
            throw new IllegalArgumentException("inorder and preorder must be of the same size!");

        if(inEnd < inStart || preEnd < preStart) {
            return null;
        }

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue); //first element in preorder corresponds to root node

        // Find index of rootValue in inorder
        int index=0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==rootValue){
                index = i;
                break;
            }
        }

        root.left=buildTree(inorder, inStart, index-1, preorder, preStart+1, preStart+index-inStart);
        root.right=buildTree(inorder, index+1, inEnd, preorder, preEnd+index-inEnd+1, preEnd);
        return root;
    }
}
