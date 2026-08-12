class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0;
        int high = 0;
        int low = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<nums.length){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high])>k){
                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
            }
            
            max = Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}