class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        int res = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                res+=nums[i];
            }else{
                break;
            }
        }
        while(map.contains(res)){
            res++;
        }
        return res;
    }
}