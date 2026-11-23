class Solution {
    boolean valid(int r,int c,int n){
        if(r<0 || c<0 || r>=n || c>=n){
            return false;
        }
        return true;
    }
    
    boolean bfs(int[][] grid,int n,int money){
        int i,j;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        Queue<int[]> q = new LinkedList<>();
        boolean [][]vis = new boolean[n][n];
        q.add(new int[]{0,0});
        vis[0][0] = true;

        while(!q.isEmpty()){
            int[] p = q.poll();
            int row = p[0];
            int col = p[1];
            if(row==n-1 && col==n-1){
                return true;
            }
            for(int k=0;k<4;k++){
                int r = row + x[k];
                int c = col + y[k];
                if(valid(r,c,n) && vis[r][c]==false && money>=grid[r][c]){
                    q.add(new int[]{r,c});
                    vis[r][c] = true;
                }
            }
        }
        return false;
    }
    public int swimInWater(int[][] grid) {
        int low = grid[0][0];
        int high = grid[0][0];
        int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                high = Math.max(high,grid[i][j]);
            }
        }
        int res = 0;
        while(low<=high){
            int guess = (low+high)/2;
            if(bfs(grid,n,guess)){
                res = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }
        return res;
    }
}