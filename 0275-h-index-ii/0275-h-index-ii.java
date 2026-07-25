class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int res = 0;
        int n = citations.length;
        int high = n-1;
        while(low<=high){
            int guess = (low+high)/2;
            if(citations[guess]>= n-guess){
                res = n-guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        } 
        return res;
    }
}