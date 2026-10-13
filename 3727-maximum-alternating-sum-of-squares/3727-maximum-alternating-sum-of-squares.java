class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        long ans = 0;
        int m = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            ans += (i < m) ? -nums[i] : nums[i];
        }
        return ans;
    }
}