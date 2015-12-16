/**
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ90_other {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int length = num.length;
        if (length == 0) return ret;
        ret.add(new ArrayList<Integer>());
        ret.add(new ArrayList<Integer>());
        ret.get(1).add(num[0]);

        int lastRound = 1;

        for (int i = 1; i<length; i++){
            int size = ret.size();
            if(num[i] != num[i-1]) lastRound = size;
            for (int j = ret.size() - lastRound; j< size; j++){
                List<Integer> l = new ArrayList<Integer>(ret.get(j));
                l.add(num[i]);
                ret.add(l);
            }
        }

        return ret;

    }
}
