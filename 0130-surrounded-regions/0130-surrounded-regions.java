class Solution {
    int x[] = {-1,1,0,0};
    int y[] = {0,0,-1,1};

    boolean isvalid(int row,int col,int n,int m){
        if(row<0 || row>=n || col<0 || col>=m){
            return false;
        }
        return true;
    }
    void dfs(char[][] a,int i,int j,int n,int m){
        a[i][j] = '#';
        for(int k = 0;k<4;k++){
            int row = i + x[k];
            int col = j + y[k];
            if(isvalid(row,col,n,m) && a[row][col]=='O'){
                dfs(a,row,col,n,m);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i,n,m);
            }
        }
        for(int i=0;i<m;i++){
            if(board[n-1][i]=='O'){
                dfs(board,n-1,i,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][m-1]=='O'){
                dfs(board,i,m-1,n,m);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='#'){
                    board[i][j] = 'O';
                }else if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}