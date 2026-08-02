class Solution {
    private int smallelements(int [][]matrix,int n,int guess){
        int count = 0;
        int row = n-1;
        int col = 0;
        while(row>=0 && col<n){
            if(matrix[row][col]>guess){
                row--;
            }else{
                count = row + 1 + count;
                col++;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int n = matrix.length;
        int high = matrix[n-1][n-1];
        int res = -1;
        while(low<=high){
            int guess = (low+ high)/2;
            if(smallelements(matrix,n,guess)<k){
                low = guess + 1;
            }else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
}