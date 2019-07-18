/**
 * Validate Binary Search Tree
 * Created by jchen on 2/26/15.
 */

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class LeetCodeOJ98 {
    public boolean isValidBST(TreeNode root) {
// Not work since left tree's largest may be bigger than right tree's smallest
//         if(root == null){
//             return true;
//         }
//         if(root.left != null && root.right != null){
//             if(root.left.val >= root.val || root.right.val <= root.val){
//                 return false;
//             }else{
//                 return isValidBST(root.left) && isValidBST(root.right);
//             }
//         } else if (root.left != null){
//             if(root.left.val >= root.val){
//                 return false;
//             }else {
//                 return isValidBST(root.left);
//             }
//         } else if (root.right != null){
//             if(root.right.val <= root.val){
//                 return false;
//             }else{
//                 return isValidBST(root.right);
//             }
//         } else {
//             return true;
//         }

        // Another solution:
        // In-order DFS
        // Keep the nodes in the path that are waiting to be visited
        Stack s = new Stack();
        // The first node to be visited is the leftmost
        TreeNode node = root;
        while (node != null)
        {
            s.push(node);
            node = node.left;
        }
        // Traverse the tree
        long pre = Long.MIN_VALUE; // Avoid corner case [-2147483648]
        while (s.size() > 0)
        {
            // Visit the top node
            node = (TreeNode)s.pop();
            // System.out.println((String)node.val);
            if(node.val <= pre){
                return false;
            }
            pre = (long)node.val;
            // Find the next node
            if (node.right != null)
            {
                node = node.right;
                // The next node to be visited is the leftmost
                while (node != null)
                {
                    s.push(node);
                    node = node.left;
                }
            }
        }

        return true;
    }
}
