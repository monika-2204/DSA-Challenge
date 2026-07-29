class Solution {
    private int require(int []weights,int guess){
        int days = 1;
        int load =0;
        for(int weight:weights){
            if(load+weight<=guess){
                load +=weight;
            }
            else {
                days++;
                load = weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high =0;
        for(int weight:weights){
            low = Math.max(low,weight);
            high += weight;
        }
        int ans = 0;
        while(low<=high){
            int guess = (low+high)/2;
            if(require(weights,guess)<=days){
                ans = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }
        return ans;
    }
}