/**
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ95 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result=helper(1,n);
        return result;
    }

    public List<TreeNode> helper(int start, int end){
        List<TreeNode> res=new ArrayList<TreeNode>();
        if(start==end){
            TreeNode temp=new TreeNode(start);
            res.add(temp);
            return res;
        }
        if(start>end){
            res.add(null);
            return res;
        }
        for(int i=start;i<=end;i++) {

            List<TreeNode> left = new ArrayList<TreeNode>();
            List<TreeNode> right = new ArrayList<TreeNode>();

            left = helper(start,i-1 );
            right = helper(i+1,end);

            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode temp=new TreeNode(i);
                    temp.left=l;
                    temp.right=r;
                    res.add(temp);
                }
            }
        }

        return res;
    }
}



