/**
 * Restore IP Addresses
 * Created by jchen on 2/26/15.
 */

import java.util.List;
import java.util.ArrayList;

public class LeetCodeOJ93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() < 4 || s.length() > 12){
            return result;
        }
        helper(result, s, new ArrayList<String>(), 0);
        return result;
    }

    public void helper(List<String> result, String s, List<String> temp, int index){
        if(temp.size() == 4){
            String tempAdd = listToString(temp);
            if(tempAdd.length() == s.length() + 3){
                result.add(tempAdd);
            }else{
                return;
            }
        }
        if(index >= s.length()){
            return;
        }
        for(int i = 1; i < 4 && index + i <= s.length(); i++){
            String numStr = s.substring(index, index +i);
            // System.out.println(numStr);
            if(isValidNum(numStr)){
                temp.add(numStr);
                // System.out.println(numStr);
                helper(result, s, temp, index + i);
                temp.remove(temp.size() - 1); // backtracking
            }
        }

    }

    public boolean isValidNum(String s){
        if(s == null || s.isEmpty() || s.length() > 3){
            return false;
        }
        if(s.charAt(0) == '0' && s.length() > 1){
            return false;
        }
        if(s.length() == 3 && Integer.parseInt(s) > 255){
            return false;
        }
        return true;
    }

    public String listToString(List<String> temp){
        if(temp.size() != 4){
            return null;
        }
        String res = "";
        for(int i = 0; i < 4; i++){
            res += temp.get(i);
            if(i != 3){
                res += '.';
            }
        }
        return res;
    }
}
