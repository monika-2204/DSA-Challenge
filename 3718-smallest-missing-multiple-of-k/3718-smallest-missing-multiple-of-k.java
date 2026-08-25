class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x%k==0){
                set.add(x);
            }
        }
        int original = k;
        while(set.contains(k)){
            k = k + original;
        }
        return k;
    }
}