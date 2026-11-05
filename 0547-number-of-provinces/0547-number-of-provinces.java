class Solution {

    void dfs(int [][]a,int i,boolean []vis,int n){
        vis[i] = true;
        for(int k =0;k<n;k++){
            if(a[i][k]==1 && !vis[k]){
                dfs(a,k,vis,n);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean []vis = new boolean[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(isConnected,i,vis,n);
                count++;
            }
        }
        return count;
    }
}