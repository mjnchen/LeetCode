/**
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LeetCodeOJ90A {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        //ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();

        if(num.length==0){
            return result;
        }
        if(num.length==1){
            List<Integer> empty=new ArrayList<Integer>();
            List<Integer> temp=new ArrayList<Integer>();
            temp.add(num[0]);
            result.add(empty);
            result.add(temp);
            return result;
        }
        //sort numerical array
        Arrays.sort(num);
        int split= num.length-1;
        int count=1;
        while(split>=1 && num[split]==num[split-1]){
            split--;
            count++;
        }
        //System.out.println(split);
        //System.out.println(count);
        int[] S_prev=new int[split]; //integers before the last integer with duplicates
        if(split>=1) {
            System.arraycopy(num, 0, S_prev, 0, split);
            List<List<Integer>> prev = subsetsWithDup(S_prev);
            result = new ArrayList<List<Integer>>(prev);
            int extra = num[split];
            //System.out.println(extra);
            for (int j = 1; j <= count; j++) {
                for (int i = 0; i < prev.size(); i++) {
                    int pos=(j-1)*prev.size()+i;
                    List<Integer> temp = new ArrayList<Integer>(result.get(pos));
                    temp.add(extra);
                    result.add(temp);
                }
            }
        }else{
            int extra = num[split];
            List<Integer> temp=new ArrayList<Integer>();
            result.add(new ArrayList<Integer>(temp));
            for(int j=1;j<=count;j++){
                temp.add(extra);
                result.add(new ArrayList<Integer>(temp));
            }
        }
        return result;
    }
}
