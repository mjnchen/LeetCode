/**
 * Created by jchen on 2/26/15.
 * Construct Binary Tree from Inorder and Postorder Traversal
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if (inorder.length != postorder.length )
            throw new IllegalArgumentException("inorder and postorder must be of the same size!");

        if(inEnd < inStart || postEnd < postStart) {
            return null;
        }

        int rootValue=postorder[postEnd];
        //System.out.println(rootValue);
        TreeNode root = new TreeNode(rootValue); //last element in postorder corresponds to root node

        /*
        // use Integer[] to get index of rootValue in inorder
        Integer[] InorderTemp = new Integer[inorder.length];

        // convert int[] to Integer[]
        for(int i = 0; i < inorder.length; i++) {
            InorderTemp[i] = Integer.valueOf(inorder[i]);
        }

        int index=Arrays.asList(InorderTemp).indexOf(rootValue);
        System.out.println(index);
        */

        // Find index of rootValue in inorder
        int index=0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==rootValue){
                index = i;
                break;
            }
        }

        root.left=buildTree(inorder, inStart, index-1, postorder, postStart, postStart+index-inStart-1);
        root.right=buildTree(inorder, index+1, inEnd, postorder, postEnd+index-inEnd, postEnd-1);
        return root;
    }
}
