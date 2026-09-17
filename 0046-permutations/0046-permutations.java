class Solution {
    void fun(int[] nums, int n,List<List<Integer>> ans,List<Integer> diary,boolean []used){
        if(diary.size()==n){
            ans.add(new ArrayList<>(diary));
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i]== true){
                continue;
            }
            diary.add(nums[i]);
            used[i] = true;
            fun(nums,n,ans,diary,used);
            diary.remove(diary.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = nums.length;
        boolean []used = new boolean[n];
        fun(nums,n,ans,diary,used);
        return ans;
    }
}