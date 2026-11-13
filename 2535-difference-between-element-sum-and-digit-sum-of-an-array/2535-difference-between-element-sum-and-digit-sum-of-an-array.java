class Solution {

    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digit = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            while(nums[i]>0){
                int di = nums[i]%10;
                digit += di;
                nums[i]/=10;
            }
        }
        int total = Math.abs(sum - digit);
        return total;
    }
}