class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low1 = 0;
        int row = -1;
        int high1 = matrix.length -1;
        while(low1<=high1){
            int guess = (low1+high1)/2;
            if(matrix[guess][0]<=target){
                row = guess;
                low1 = guess+1;
            }else{
                high1 = guess-1;
            }
        }
        
        if(row==-1)
            return false;

        int low2 = 0;
        int high2 = matrix[0].length-1;
        while(low2<=high2){
            int guess = (low2+high2)/2;
            if(matrix[row][guess]==target){
                return true ;
            }else if(matrix[row][guess]>target){
                high2 = guess-1;
            }else{
                low2 = guess+1;
            }
        }
        return false;
    }
}