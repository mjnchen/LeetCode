/**
 * Created by jchen on 05/15/15.
 * Gas Station
 */

import java.util.*;

public class LeetCodeOJ134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // if (gas == null || cost == null || gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
        //     return -1;
        // }
        // outerloop:
        // for (int i = 0; i < gas.length; i++) {
        //     // Start at ith station
        //     int gasStart = 0, costStart = 0;
        //     innerloop:
        //     for (int j = i; j < i + gas.length; j++) {
        //         int temp = j % gas.length;
        //         gasStart += gas[temp];
        //         costStart += cost[temp];
        //         if (gasStart < costStart) {
        //             continue outerloop;
        //         }
        //     }
        //     return i;
        // }
        // return -1;

        // Better solution
        if (gas == null || cost == null || gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
            return -1;
        }

        int n = gas.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = gas[i] - cost[i];
        }

        int curSum = 0, remainGas = 0, start = 0;
        for (int i = 0; i < n; i++) {
            remainGas += diff[i];
            curSum += diff[i];

            if (curSum < 0) { // 只要小于0就不可能是解
                start = i + 1;
                curSum = 0;
            }
        }

        if (remainGas < 0){
            return -1;
        } else {
            return start;
        }
    }
}
