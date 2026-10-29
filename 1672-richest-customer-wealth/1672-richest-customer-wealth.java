class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealthy = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int[] a = accounts[i];
            int sum = 0;
            for(int j =0;j<a.length;j++){
                sum+=a[j];
            }
            wealthy = Math.max(wealthy,sum);
        }
        return wealthy;
    }
}