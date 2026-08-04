class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min= Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = min+1;i<=max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        
        return result;
    }
}