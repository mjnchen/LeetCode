/**
 * Created by jchen on 12/29/15.
 * 168. Excel Sheet Column Title
 */

public class LeetCodeOJ168 {
    public String convertToTitle(int n) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder res = new StringBuilder();

        int mod = n, remain = 0;
        while (mod > 0) {
            remain = (mod -1) % 26;
            mod = (mod -1) / 26;
            res.insert(0, String.valueOf(alphabet[remain]));
        }

        return res.toString();
    }
}

