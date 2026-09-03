class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2!=0)
            min = Math.min(min,i);
        }
        for(int num:nums1){
            if(num%2==0 && min!=Integer.MAX_VALUE){
                if(num-min<0){
                    return false;
                }
            }
        }
        return true;
    }
}