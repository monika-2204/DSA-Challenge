class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int small = 0;
        int t = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) small++;
            if(nums[i]==target) t++;
        }
        if(t==0) return ans;
        for(int i=0;i<t;i++){
            ans.add(small++);
        }
        return ans;
    }
}