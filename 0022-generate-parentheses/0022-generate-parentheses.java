class Solution {
    void fun(int n,StringBuilder s,int open,int close,List<String> str){
        if(open==n && close==n){
            str.add(s.toString());
        }
        if(open>close && open<=n){
            s.append(')');
            fun(n,s,open,close+1,str);
            s.deleteCharAt(s.length()-1);
        }
        if(open<=n){
            s.append('(');
            fun(n,s,open+1,close,str);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        fun(n,new StringBuilder(),0,0,str);
        return str;
    }
}