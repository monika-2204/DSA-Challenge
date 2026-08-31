class Solution {
    void fun(int[] arr, int n, int target, List<Integer> diary, int sum, List<List<Integer>> res, int idx) {
        if (idx == n) {
            if (sum == target) {
                res.add(new ArrayList<>(diary));
            }
            return;
        }

        fun(arr, n, target, diary, sum, res, idx + 1);

        if (sum + arr[idx] <= target) {
            diary.add(arr[idx]);
            sum+=arr[idx];
            fun(arr, n, target, diary, sum, res, idx); 
            diary.remove(diary.size() - 1); 
            sum-=arr[idx];
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = candidates.length;
        fun(candidates, n, target, diary, 0, list, 0);
        return list;
    }
}