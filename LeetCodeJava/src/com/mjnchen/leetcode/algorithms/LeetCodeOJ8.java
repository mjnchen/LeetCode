/**
 * String to Integer (atoi)
 * Created by jchen on 8/16/15.
 */
public class LeetCodeOJ8 {
    public int myAtoi(String str) {
        if(str == null || str.length() <= 0){
           return 0;
        }
        str = str.trim(); // remove white spaces

        char sign = '+';
        int i = 0;
        if(str.charAt(0) == '-'){
            sign = '-';
            i++;
        }else if(str.charAt(0) == '+'){
            i++;
        }
        double result = 0;

        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = result * 10 + str.charAt(i) - '0';
            i++;
        }
        if (sign == '-') {
            result = -1 * result;
        }

        if(result > Integer.MAX_VALUE ){
            return Integer.MAX_VALUE;
        }else if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
