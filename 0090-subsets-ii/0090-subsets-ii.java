class Solution {
    void fun(int []nums,int n,int idx,List<Integer> diary,List<List<Integer>> ans){
       ans.add(new ArrayList<>(diary));
       
       for(int i=idx;i<n;i++){
        if(i>idx && nums[i]==nums[i-1]){
            continue;
        }
        diary.add(nums[i]);
        fun(nums,n,i+1,diary,ans);
        diary.remove(diary.size()-1); 
       }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> diary = new ArrayList<>();
       fun(nums,nums.length,0,diary,ans);
       return ans; 
    }
}