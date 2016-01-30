/**
 * Created by jchen on 12/29/15.
 * 165. Compare Version Numbers
 */

public class LeetCodeOJ165 {
    public int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String[] v2Arr = version2.split("\\.");

        int len1 = v1Arr.length;
        int len2 = v2Arr.length;

        for (int i = 0; i < Math.min(len1, len2); i++) {
            int num1 = Integer.parseInt(v1Arr[i]);
            int num2 = Integer.parseInt(v2Arr[i]);
            if (num1 > num2) {
                return 1;
            }
            if (num1 < num2) {
                return -1;
            }
        }
        if (len1 > len2) {
            for (int j = len2; j < len1; j++) {
                int num = Integer.parseInt(v1Arr[j]);
                if (num > 0) {
                    return 1;
                }
            }
        }
        if (len2 > len1) {
            for (int j = len1; j < len2; j++) {
                int num = Integer.parseInt(v2Arr[j]);
                if (num > 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}

