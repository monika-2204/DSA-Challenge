class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1;
                int h = n-1;
                while(k<h){
                    long sum = (long) nums[i]+nums[j]+nums[k]+nums[h];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[h]));
                        k++;
                        h--;
                        while(k<n && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(h>0 && nums[h]==nums[h+1]){
                            h--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        h--;
                    }
                }
            }
        }
        return list;
    }
}