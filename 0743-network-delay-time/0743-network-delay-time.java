class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       int res[] = new int[n];
       Arrays.fill(res,Integer.MAX_VALUE);

       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

       ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList());
       }

       for(int i=0;i<times.length;i++){
        int ed[] = times[i];
        int u = ed[0];
        int v = ed[1];
        int wt = ed[2];
        adj.get(u-1).add(new int[]{v-1,wt});
       }
       pq.add(new int[]{0,k-1});
       res[k-1] = 0;

       while(!pq.isEmpty()){
        int p[] = pq.poll();
        int node = p[1];
        int d = p[0];
        if(d>res[node]) continue;
        for(int i=0;i<adj.get(node).size();i++){
            int neigh = adj.get(node).get(i)[0];
            int wt = adj.get(node).get(i)[1];
            if(d+wt<res[neigh]){
                res[neigh] = d+wt;
                pq.add(new int[]{d+wt,neigh});
            }
        }
       }
       int maximum = 0;
       for(int i=0;i<n;i++){
        if(res[i]==Integer.MAX_VALUE){
            return -1;
        }
        maximum = Math.max(maximum,res[i]);
       }
       return maximum;
    }
}