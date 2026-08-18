class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int freq[] = new int[51];
        for(int num:nums){
            freq[num]++;
        }
        if(k==n){
            int max = -1;
            for(int num:nums){
                max = Math.max(num,max);
            }
            return max;
        }
        if(k==1){
            int a = -1;
            for(int num:nums){
                if(freq[num]==1){
                    a = Math.max(num,a);
                }
            }
            return a;
        }
        int ans = -1;
        if(k<n && k>1){
            if(freq[nums[0]]==1){
                ans = Math.max(ans,nums[0]);
            }
            if(freq[nums[n-1]]==1){
                ans = Math.max(ans,nums[n-1]);
            }
        }

        return ans;
    }
}
