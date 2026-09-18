class Solution {
    void fun(int start,int n,int k,List<Integer> diary,List<List<Integer>> ans){
        if(diary.size()==k){
            ans.add(new ArrayList<>(diary));
            return;
        }
        for(int i=start;i<=n;i++){
            diary.add(i);
            fun(i+1,n,k,diary,ans);
            diary.remove(diary.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}