package com.mjnchen.leetcode.algorithms;

/**
 * N-Queens
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        dfs(n, 0, new int[n], result);
        return result;
    }

    public void dfs(int n, int row, int[] columnForRow, List<List<String>> result){
        if(row == n){
            List<String> temp = new ArrayList<String>();
            for(int i = 0; i < n; i++){
                StringBuilder strRow = new StringBuilder();
                for(int j = 0; j < n; j++){
                    if(columnForRow[i] == j){
                        strRow.append('Q');
                    }else{
                        strRow.append('.');
                    }
                }
                temp.add(strRow.toString());
            }
            result.add(temp);
            return;
        }
        for(int i = 0; i < n; i++){
            columnForRow[row] = i;
            if(isSafe(row, columnForRow)){
                dfs(n, row + 1, columnForRow, result);
            }
        }
    }

    public boolean isSafe(int row, int[] columnForRow){
        for(int i = 0; i < row; i++){
            if(columnForRow[row] == columnForRow[i] || Math.abs(columnForRow[row] - columnForRow[i]) == row - i) {
                return false;
            }
        }
        return true;
    }
}
