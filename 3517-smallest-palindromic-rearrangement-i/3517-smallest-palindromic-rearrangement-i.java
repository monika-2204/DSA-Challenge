class Solution {
    public String smallestPalindrome(String s) {
        int []fre = new int[26];
        for(char c : s.toCharArray()){
            fre[c-'a']++;
        }
        StringBuilder left = new StringBuilder();
        char middle = 0;
        for(int i=0;i<26;i++){
            int half = fre[i]/2;
            while(half-->0){
                left.append((char)('a'+i));
            }
            if(fre[i]%2==1){
                middle = (char)('a'+i);
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(left);
        if(middle!=0){
            ans.append(middle);
        }
        return ans.append(new StringBuilder(left).reverse()).toString();
    }
}