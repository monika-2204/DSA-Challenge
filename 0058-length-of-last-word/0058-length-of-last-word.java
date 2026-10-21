class Solution {
    public int lengthOfLastWord(String s) {
        
        String ts = s.trim();
        if(ts.length()==1) return 1;
        for(int i=ts.length()-1;i>=0;i--){
                if(ts.charAt(i) == ' '){
                return ts.length()-1-i;
            }
        }
        return ts.length();
    }
}