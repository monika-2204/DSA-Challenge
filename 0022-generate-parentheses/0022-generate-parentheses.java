import java.util.*;

class Solution {

     private void backtrack(List<String> res, StringBuilder temp, int open, int close, int n) {
       if(open==n && close ==n){
        res.add(temp.toString());
        return ;
       }
       if(open<n){
        temp.append('(');
        backtrack(res,temp,open+1,close,n);
        temp.deleteCharAt(temp.length()-1);
       }
       if(close<open){
        temp.append(')');
        backtrack(res,temp,open,close+1,n);
        temp.deleteCharAt(temp.length()-1);
       }
}

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }
}