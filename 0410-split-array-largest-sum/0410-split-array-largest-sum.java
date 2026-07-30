class Solution {
    private boolean require(int []nums ,int guess, int k) {
        int count=1;
        int sum=0;
        for(int s:nums) {
            if(sum+s<=guess){
                sum+=s;
            }else{
                count++;
                sum = s;
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int low =0;
        int high =0;
        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }
        int ans = 0;
        while(low<=high){
            int guess= (low+high)/2;
            if(require(nums, guess, k)){
                ans= guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }
        return ans;
    }
}