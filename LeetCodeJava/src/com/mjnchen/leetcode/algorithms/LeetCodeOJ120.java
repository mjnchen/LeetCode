/**
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ120 {
    public int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        for(int i=0;i<n;i++){
            List<Integer> temp=triangle.get(i);
            for(int j=0;j<=i;j++){
                if(i>0) {
                    if(j==0){
                        temp.set(j, triangle.get(i).get(j) + triangle.get(i-1).get(j));
                    }else {
                        temp.set(j, triangle.get(i).get(j) + Math.min(triangle.get(i-1).get(j-1), j>(i-1)?Integer.MAX_VALUE:triangle.get(i-1).get(j)));
                    }
                }
            }
            triangle.set(i,temp);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(triangle.get(n-1).get(i)<min){
                min=triangle.get(n-1).get(i);
            }
        }
        return min;
    }
}
