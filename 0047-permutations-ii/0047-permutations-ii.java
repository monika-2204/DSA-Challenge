class Solution {
    void fun(int []nums,boolean []used,int n,List<List<Integer>> ans,List<Integer> diary){
        if(diary.size()==n){
            ans.add(new ArrayList<>(diary));
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            diary.add(nums[i]);
            used[i]=true;
            fun(nums,used,n,ans,diary);
            diary.remove(diary.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        boolean []used = new boolean[nums.length];
        fun(nums,used,nums.length,ans,diary);
        return ans;
    }
}