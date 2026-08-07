class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int cls = 0 ;
       int mindif = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int low = i+1;
        int high = nums.length-1;
        while(high>low){
            int sum = nums[i] + nums[low] + nums[high];
            int diff = Math.abs(target - sum);
            if(sum ==target){
                return sum;
            }
            else if(sum<target){
                low++;
            }
            else{
                high--;
            }
            if(diff<mindif){
                mindif = diff;
                cls = sum;
            }
        }
       }
       
       return cls;
    }
}