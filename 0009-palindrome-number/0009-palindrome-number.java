class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        if(x<0) return false;
        while(temp!=0){
            int rem =  temp%10;
            reverse = reverse*10 + rem;
            temp /= 10;
        }
        return x==reverse;
    }
}