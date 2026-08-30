class Solution {
    public int minimumDeletions(int[] nums) {
        int maximum = nums[0];
        int minimum = nums[0];
        int maxid = 0;
        int minid = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum = nums[i];
                maxid = i;
            }
            if(nums[i]<minimum){
                minimum = nums[i];
                minid = i;
            }
        }
        int option1 = Math.max(maxid+1,minid+1);
        int option2 = Math.max(nums.length-minid,nums.length-maxid);
        int mixed = Math.min(maxid+1+(nums.length-minid),(nums.length-maxid)+minid+1);
        int total = Math.min(option1,Math.min(option2,mixed));
        return total;
    }
}