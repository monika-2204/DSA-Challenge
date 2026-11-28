class Solution {
    boolean valid(int r,int c,int n,int m){
        if(r<0 || r>=m || c<0 || c>=n) return false;
        return true;
    }
    boolean dfs(int i,int j,String word,int id,char[][] board,int n,int m){
        if(id==word.length()-1) return true;
        int []x = {-1,1,0,0};
        int []y = {0,0,-1,1};
        char temp = board[i][j];
        board[i][j]='#';
        
        for(int k=0;k<4;k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(row,col,n,m) && word.charAt(id+1)==board[row][col]){
                if(dfs(row,col,word,id+1,board,n,m)){
                    board[i][j] = temp;
                    return true;
                }
            }
        }
        board[i][j] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int id = 0;
        int m = board.length;
        int n = board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(id)){
                    if(dfs(i,j,word,id,board,n,m)) return true;
                }
            }
        }
        return false;
    }
}