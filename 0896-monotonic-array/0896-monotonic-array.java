class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2) return true;
        if(nums[0]>nums[1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]<nums[i]) return false;
            }
        }
        else if(nums[0]<nums[1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]>nums[i]) return false;
            }
        }
        else{
            if(nums[0]>nums[nums.length-1]){
                for(int i=1;i<nums.length;i++){
                    if(nums[i-1]<nums[i]) return false;
                }
            }else{
                for(int i=1;i<nums.length;i++){
                    if(nums[i-1]>nums[i]) return false;
                }
            }
        }
        return true;
    }
}