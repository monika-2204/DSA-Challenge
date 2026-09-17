class Solution {
    void fun(int []nums,List<List<Integer>> ans,List<Integer> diary,int n,int idx){
        ans.add(new ArrayList<>(diary));
          
        for(int i=idx;i<n;i++){
            diary.add(nums[i]);
            fun(nums,ans,diary,n,i+1);
            diary.remove(diary.size()-1);
        }
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = nums.length;
        fun(nums,ans,diary,n,0);
        return ans;
    }
}