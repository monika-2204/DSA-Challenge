class Solution {
    public int maxSubArray(int[] nums) {
        int bestending = nums[0];
        int ans = nums[0];
        for(int I=1;I<nums.length;I++) {
            bestending = Math. max(nums[I],bestending+nums[I]);
            ans= Math. max(bestending, ans);
        }
        return ans;
    }
}