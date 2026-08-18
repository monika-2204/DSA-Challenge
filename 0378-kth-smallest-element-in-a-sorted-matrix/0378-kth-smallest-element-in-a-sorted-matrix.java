class Solution {
    class pair{
        int value ;
        int row;
        int col;
        pair(int c,int n,int col){
            this.value = c;
            this.row = n;
            this.col = col;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
            return a.value-b.value;
        });
        int n = matrix.length;
        for(int i=0;i<matrix.length;i++){
            pq.add(new pair(matrix[i][0],i,0));
        }
        for(int i=0;i<k;i++){
            pair curr = pq.poll();
            int row = curr.row;
            int col = curr.col;
            if(col+1<n){
                pq.add(new pair(matrix[row][col+1],row,col+1));
            }
            if(i==k-1){
                return curr.value;
            }
        }
        return -1;
    }
}