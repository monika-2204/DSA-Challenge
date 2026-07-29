class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for(int candy:candies){
            max = Math.max(max,candy);
        }
        int low =1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int guess = (low+high)/2;
            long count = 0;
            for(int candy:candies){
                count+=candy/guess;
            }
            if(count>=k){
                ans = guess;
                low = guess+1;
            }
            else{
                high = guess-1;
            }
        }
        return ans;
    }
}