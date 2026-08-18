class Solution {
    class pair{
        int count;
        int num ;
        pair(int c,int n){
            this.count = c;
            this.num = n;
        }
    }
    private int ones(int []row){
        int low = 0;
        int high = row.length-1;
        while(low<=high){
            int guess = (low+high)/2;
            if(row[guess]==1){
                low = guess+1;
            }else{
                high = guess-1;
            }
        }
        return low;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
            if(a.count != b.count){
                return b.count - a.count;
            }
            return b.num - a.num;
        });
        for(int i=0;i<mat.length;i++){
            int co = ones(mat[i]);
            pq.add(new pair(co,i));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int d = k-1;
        while(!pq.isEmpty()){
            int index = pq.poll().num;
            res[d--] = index;
        }
        return res;
    }
}