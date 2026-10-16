class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = ch;
            if(ch >='A' && ch<='Z'){
                ascii = ch+32;
                ch = (char)ascii;
            }
                str.append(ch);
        }
        return str.toString();
    }
}