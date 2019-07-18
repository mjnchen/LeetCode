/**
 * Simplify Path
 * Created by jchen on 2/26/15.
 */

import java.util.Stack;
public class LeetCodeOJ71 {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return path;
        }

        Stack<String> temp = new Stack<String>();
        String curDir = "";
        path = path + '/';
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == '/') {
                if(curDir.length() == 0){
                    continue;
                }else if(curDir.equals(".")){
                    curDir = "";
                }else if(curDir.equals("..")) {
                    if(!temp.empty()){
                        temp.pop();
                    }
                    curDir = "";
                }else{
                    temp.add(curDir);
                    curDir = "";
                }
            }else{
                curDir += path.charAt(i);
                // System.out.println(curDir);
            }
        }

        StringBuilder res = new StringBuilder();
        for(int j = 0; j < temp.size(); j++){
            res.append("/" + temp.get(j));
        }

        if(res.length() == 0){
            return "/";
        }

        return res.toString();
    }
}
