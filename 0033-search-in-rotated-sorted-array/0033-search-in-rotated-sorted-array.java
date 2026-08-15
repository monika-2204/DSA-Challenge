class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        
        while(high>=low) {
            int guess = (low+high)/2;
            if(nums[guess]==target){
                return guess;
            }
            if(nums[guess]>nums[n-1]){
                if(nums[guess]<target){
                    low = guess+1;
                }else{
                    if(target<nums[0])
                        low = guess+1;
                    else 
                        high = guess-1;
                }
            }else{
                if(nums[guess]>target)
                    high = guess-1;
                else{
                    if(target>nums[n-1]) 
                        high = guess-1;
                    else
                        low = guess+1;
                }
            }
            
        }
        return -1;
    }
}