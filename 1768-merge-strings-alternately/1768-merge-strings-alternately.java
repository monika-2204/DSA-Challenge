class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int low = 0;
        int high = word1.length();
        int h = word2.length();
        while(high>low && h>low){
            s.append(word1.charAt(low));
            s.append(word2.charAt(low));
            low++;
        }
        while(low<high){
            s.append(word1.charAt(low));
            low++;
        }
        while(low<h){
            s.append(word2.charAt(low));
            low++;
        }
        return s.toString();
    }
}