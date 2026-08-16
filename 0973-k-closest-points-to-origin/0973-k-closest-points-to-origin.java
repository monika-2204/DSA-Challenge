class Solution {
    class pair{
        int dist ;
        int index;
        pair(int f,int s){
            this.dist = f;
            this.index = s;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)-> b.dist - a.dist);
        for(int i=0;i<points.length;i++){
            int distance = (points[i][0]*points[i][0]+points[i][1]*points[i][1]);
            pair curr = new pair(distance,i);
            if(pq.size()<k){
                pq.add(curr);
            }else if(curr.dist<pq.peek().dist){
                pq.poll();
                pq.add(curr);
            }
        }
        int [][]res = new int[k][points[0].length];
        
        int id =0;
        while(!pq.isEmpty()){
            int index = pq.poll().index;
            res[id][0]= points[index][0];
            res[id][1] = points[index][1];
            id++;
        }
        return res;
    }
}