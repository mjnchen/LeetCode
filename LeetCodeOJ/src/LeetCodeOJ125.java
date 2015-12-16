/**
 * Valid Palindrome
 * Created by jchen on 2/26/15.
 */


public class LeetCodeOJ125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length() == 1){
            return true;
        }
        // Remove special characters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int len = s.length();
        for(int i = 0; i < len / 2; i++){
            if(s.charAt(i) != s.charAt(len - 1 -i)){
                return false;
            }
        }
        return true;
    }
}
