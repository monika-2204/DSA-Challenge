class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length-1;
        int row = n-1;
        int col = 0;
        while(row >= 0 && col <= m){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                col++;
            }else {
                row--;
            }
        }
        return false;
    }
}