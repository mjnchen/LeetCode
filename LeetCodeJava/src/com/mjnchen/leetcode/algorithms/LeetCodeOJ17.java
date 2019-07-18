/**
 * Letter Combinations of a Phone Number
 * Created by jchen on 8/16/15.
 */
import java.util.*;
public class LeetCodeOJ17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();

        if(digits == null || digits.length() == 0){
            return result;
        }

        String[] matches = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder temp = new StringBuilder();

        dfs(matches, digits, result, 0, temp);

        return result;

    }

    public void dfs(String[] matches, String digits, List<String> result, int index, StringBuilder temp){
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }

        String letters = matches[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
            temp.append(letters.charAt(i));
            dfs(matches, digits, result, index + 1, temp);
            temp.deleteCharAt(index);
        }
    }

}
