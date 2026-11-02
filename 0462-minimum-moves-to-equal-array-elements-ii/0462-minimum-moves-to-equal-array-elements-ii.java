class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = 0;
        if(n%2!=0){
            mid = nums[n/2];
        }
        else{
            mid = (nums[n/2] + nums[n/2-1])/2;
        }
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[i]-mid);
        }
        return (int)sum;
    }
}