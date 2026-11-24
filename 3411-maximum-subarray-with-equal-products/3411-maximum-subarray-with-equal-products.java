class Solution {
    int gcd(int a ,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int maxLength(int[] nums) {
        int lcm = 2;
        int product =1;
        int left = 0;
        for(int i=0;i<nums.length;i++){
            while(gcd(product,nums[i])>1){
                product /= nums[left++];
            }
                product *= nums[i];
                lcm = Math.max(lcm,i-left+1);
        }
        return lcm;
    }
}