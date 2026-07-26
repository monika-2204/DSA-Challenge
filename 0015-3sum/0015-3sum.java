class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int low = i+1;
            int high = nums.length-1;
            while(high>low){
                int sum = nums[i]+ nums[low]+nums[high];
                if(sum==0){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[low],nums[high])));
                    low++;
                    high--;
                while(low<nums.length && nums[low]==nums[low-1]){
                    low++;
                }
                while(high>0 && nums[high]==nums[high+1]){
                    high--;
                }
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return list;
    }
}