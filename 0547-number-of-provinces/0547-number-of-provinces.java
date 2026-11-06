class Solution {
    void dfs(int [][]adj,int i,boolean []vis){
        vis[i] = true;
        for(int j=0;j<adj.length;j++){
            if(adj[i][j]==1 && !vis[j]){
                dfs(adj,j,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean []vis = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                dfs(isConnected,i,vis);
                count++;
            }
        }
        return count;
    }
}