class Solution {
    boolean res = true;

    void dfs(int []colors,int i,int[][] graph,int n,int c){
        colors[i] = c;
        for(int j = 0;j<graph[i].length;j++){
            int neigh = graph[i][j];
            if(colors[neigh] == -1){
                dfs(colors,neigh,graph,n,1-c);
            }
            if(colors[neigh] != -1 && colors[neigh] == c){
                res = false;
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int []colors = new int[n];
        Arrays.fill(colors,-1);
        
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                dfs(colors,i,graph,n,0);
            }
        }
        return res;
    }
}