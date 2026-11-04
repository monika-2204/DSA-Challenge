class Solution {
    private int gcd(int l1,int l2){
        int min = Math.min(l1,l2);
        for(int j = min;j>0;j--){
            if(l1 % j == 0 && l2 % j == 0){
                return j;
            }
        }
        return 1;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int a = gcd(str1.length(),str2.length());
        return str1.substring(0,a);
    }
}