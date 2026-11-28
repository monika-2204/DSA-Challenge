class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int num : set){
            int current=0;
            int len = 0;
            
            if(!set.contains(num-1)){
                len = 1;
                current = num;
                if(current==Integer.MAX_VALUE) break;
                while(set.contains(current+1)){
                    current++;
                    len++;
                    }
            }
            max = Math.max(len,max);
        }
        return max;
    }
}