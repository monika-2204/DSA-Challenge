class Solution {
    boolean valid(int i,int j,int n,int m){
        if(i<0 || i>=n || j<0 || j>=m) return false;
        return true;
    }
    
    int []x = {-1,1,0,0};
    int []y = {0,0,-1,1};

    void dfs(int i,int j,int m,int n,char[][] board){
        board[i][j] = '#';
        for(int k=0;k<4;k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(row,col,n,m) && board[row][col]=='O')
            dfs(row,col,m,n,board);
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<m;i++){
            if(board[n-1][i]=='O'){
                dfs(n-1,i,m,n,board);
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(0,i,m,n,board);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O') dfs(i,0,m,n,board);
        }
        for(int i=0;i<n;i++){
            if(board[i][m-1] == 'O') dfs(i,m-1,m,n,board);
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]=='#') board[i][j] ='O';
                else board[i][j] = 'X';
            }
        }
    }
}