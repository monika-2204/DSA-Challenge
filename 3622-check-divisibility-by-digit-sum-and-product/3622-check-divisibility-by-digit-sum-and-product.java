class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n/=10;
        }
        return original % (sum + product) == 0;
    }
}