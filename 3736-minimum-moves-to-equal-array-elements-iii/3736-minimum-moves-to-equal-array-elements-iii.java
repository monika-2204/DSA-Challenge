class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[i]-max);
        }
        return sum;
    }
}