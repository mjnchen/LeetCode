import java.util.HashMap;

/**
 * Count and Say
 * Created by jchen on 8/16/15.
 */

public class LeetCodeOJ38 {
    public String countAndSay(int n) {
        // if(n <= 0 ){
        //     return "";
        // }
        // if(n == 1){
        //     return "1";
        // }
        // if(n == 2){
        //     return "11";
        // }

        // HashMap<String, String> lookUp = new HashMap<String, String>();
        // lookUp.put("11", "21");
        // lookUp.put("12", "1112");
        // lookUp.put("21", "1211");

        // String prev = countAndSay(n-1);
        // String current = new String();
        // int len = prev.length();
        // for(int i = 0; i < len; i += 2){
        //     String temp = prev.substring(i, i + 2);
        //     String addCurrent = lookUp.get(temp);
        //     current += addCurrent;
        // }

        // return current;

        // Another approach
        if(n <= 0){
            return "";
        }

        String result = "1";
        int i =1;

        while(i < n){
            StringBuilder tempStr = new StringBuilder();
            int count = 1;
            int resLen =result.length();
            for(int j = 1; j <= resLen; j++){
                if(j < resLen && result.charAt(j) == result.charAt(j - 1)){
                    count++;
                }else{
                    tempStr.append(count);
                    tempStr.append(result.charAt(j - 1));
                    count = 1;
                }
            }
            // tempStr.append(count);
            // tempStr.append(result.charAt(result.length() - 1));
            result = tempStr.toString();
            i++;
        }

        return result;
    }
}
