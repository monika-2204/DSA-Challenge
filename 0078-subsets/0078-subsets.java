class Solution {
    void fun(int []nums,List<List<Integer>> ans,List<Integer> diary,int n,int idx){
        if(idx==n){
            ans.add(new ArrayList<>(diary));
            return;
        }
        fun(nums,ans,diary,n,idx+1);
        diary.add(nums[idx]);
        fun(nums,ans,diary,n,idx+1);
        diary.remove(diary.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = nums.length;
        fun(nums,ans,diary,n,0);
        return ans;
    }
}