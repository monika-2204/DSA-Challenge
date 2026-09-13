class Solution {
    void fun(int[] candidates,int target,int n,int idx,int sum,List<Integer> diary,List<List<Integer>> ans){
        if(sum==target){
                ans.add(new ArrayList<>(diary));
                return;
            }
        if(sum>target || idx==n){
            return;
        }
            diary.add(candidates[idx]);
            sum+=candidates[idx];
            fun(candidates,target,n,idx+1,sum,diary,ans);
            diary.remove(diary.size()-1);
            sum-=candidates[idx];
            
        int next = idx+1;
        while(next<n && candidates[idx]==candidates[next]){
            next++;
        }
        fun(candidates,target,n,next,sum,diary,ans);
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