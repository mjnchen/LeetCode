/**
 * Implement strStr()
 * Created by jchen on 8/16/15.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCodeOJ28 {
    public int strStr(String haystack, String needle){
        if(haystack == null || needle == null){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }
        int n = haystack.length();
        int m= needle.length();
        for(int i = 0; i < n; i++){
            if(i + m > n){
                break; // Not enough characters to match
            }

            boolean match = true;
            for(int j =0; j < m; j++){
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    match = false;
                    break;
                }
            }
            if(match){
                return i;
            }
        }

        return -1;
    }
}
