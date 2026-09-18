class Solution {
    void fun(char []s,int length,int idx){
        if(idx>=length){
            return ;
        }
        char temp = s[idx];
        s[idx] = s[length];
        s[length] = temp;

        fun(s,length-1,idx+1);
    }
    public void reverseString(char[] s) {
       fun(s,s.length-1,0);
       return ;
    }
}