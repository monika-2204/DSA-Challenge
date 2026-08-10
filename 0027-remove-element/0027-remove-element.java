class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int k =0;
        while(j<nums.length){
            if(nums[j]==val){
                j++;
                continue;
            }
            nums[i]=nums[j];
            i++;
            j++;
            k++;
        }
        return k;
    }
}
