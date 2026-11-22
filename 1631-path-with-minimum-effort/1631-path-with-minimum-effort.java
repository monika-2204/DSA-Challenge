class Solution {
    boolean valid(int r,int c,int n,int m){
        if(r<0 || r>=n || c<0 || c>=m){
            return false;
        }
        return true;
    }

    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0,0});

        int res[][] = new int[heights.length][heights[0].length];
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        res[0][0] = 0;

        int x[] = {-1,1,0,0};
        int y[] = {0,0,-1,1};

        while(!pq.isEmpty()){
            int []p = pq.poll();
            int d = p[0];
            int row = p[1];
            int col = p[2];
            if(d>res[row][col]) continue;
            for(int k=0;k<4;k++){
                int r = row + x[k];
                int c = col + y[k];
                if(!valid(r,c,heights.length,heights[0].length)){
                    continue;
                }
                int diff = Math.abs(heights[row][col]-heights[r][c]);
                int newwt = Math.max(d,diff);
                if(newwt<res[r][c]){
                    res[r][c] = newwt;
                    pq.add(new int[]{newwt,r,c});
                }
            }
        }
        return res[heights.length-1][heights[0].length-1];
    }
}