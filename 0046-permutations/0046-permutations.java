class Solution {
    void fun(int []nums,int n,List<List<Integer>> ans,int idx){
        if(idx==n){
            List<Integer> diary = new ArrayList<>();
            for(int num:nums) diary.add(num);
            ans.add(diary);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(nums,idx,i);
            fun(nums,n,ans,idx+1);
            swap(nums,idx,i);
        }

    }
    void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        fun(nums,n,ans,0);
        return ans;
    }
}