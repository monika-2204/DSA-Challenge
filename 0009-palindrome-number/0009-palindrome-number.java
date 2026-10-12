class Solution {
    public boolean isPalindrome(int x) {
        long reverse = 0;
        long temp = x;
        if(x<0) return false;
        while(temp!=0){
            int rem = (int) temp%10;
            reverse = reverse*10 + rem;
            temp /= 10;
        }
        return x==reverse;
    }
}