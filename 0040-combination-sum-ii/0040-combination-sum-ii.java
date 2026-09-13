class Solution {
    void fun(int[] candidates,int target,int n,int idx,int sum,List<Integer> diary,List<List<Integer>> ans){
        if(sum==target){
                ans.add(new ArrayList<>(diary));
                return;
            }
        if(sum>target || idx==n){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if(sum+candidates[i]>target){
                break;
            }
            diary.add(candidates[i]);
            sum = sum+candidates[i];
            fun(candidates,target,n,i+1,sum,diary,ans);
            diary.remove(diary.size()-1);
            sum-= candidates[i];
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        List<Integer> diary = new ArrayList<>();
        fun(candidates,target,n,0,0,diary,ans);
        return ans;
    }
}