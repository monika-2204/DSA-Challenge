class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51]; // since nums[i] ≤ 50
        for (int num : nums) count[num]++;

        if (k == n) return Arrays.stream(nums).max().getAsInt();

        if (k == 1) {
            int ans = -1;
            for (int num : nums) {
                if (count[num] == 1) ans = Math.max(ans, num);
            }
            return ans;
        }

        int left = (count[nums[0]] == 1) ? nums[0] : -1;
        int right = (count[nums[n-1]] == 1) ? nums[n-1] : -1;
        return Math.max(left, right);
    }
}