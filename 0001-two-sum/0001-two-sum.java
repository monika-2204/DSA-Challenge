class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int n[] = new int[2];
        for(int i =0;i<nums.length;i++){
            int f = target-nums[i];
           if(map.containsKey(f)){
            n[0] = map.get(f);
            n[1] = i;
           }
            map.put(nums[i],i);
        }
        return n;
    }
}
