class Solution {
    public int nextindex(int []nums,int curr){
        int n = nums.length;
        return ((curr+nums[curr]) %n+n)%n;
    }
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int slow = i;
            int fast = i;
            if(nums[i]==0) continue;
            boolean forward = nums[i]>0;

            while(true){
                int nextslow = nextindex(nums,slow);
                int nextfast = nextindex(nums,fast);
                if(((nums[nextslow]>0) != forward) || ((nums[nextfast]>0) != forward))
                break;
                nextfast = nextindex(nums,nextfast);
                if((nums[nextfast]>0) != forward)
                break;
                slow = nextslow;
                fast = nextfast;
                if(slow == fast){
                    if(slow == nextindex(nums,slow)) break;
                    return true;
                }
            }
            int curr = i;
            while((nums[curr]>0) == forward){
                int next = nextindex(nums,curr);
                nums[curr] = 0;
                if(curr == next)
                break;
                curr = next;
            }
        }
        return false;
    }
}