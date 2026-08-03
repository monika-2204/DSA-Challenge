class Solution {
    private int count(int m,int n,int guess){
        int count = 0;
        for(int i = 1;i<=m;i++){
            count += Math.min(n,guess/i);
        }
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m*n;
        int res = -1;
        while(low<=high){
            int guess = (low+high)/2;
            if(count(m,n,guess)<k){
                low = guess + 1;
            }else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
}