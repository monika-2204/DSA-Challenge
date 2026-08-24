class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int project[][] = new int[profits.length][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<profits.length;i++){
            project[i][0] = capital[i];
            project[i][1] = profits[i];
        }
        Arrays.sort(project,(a,b)-> Integer.compare(a[0],b[0]));
        int i =0;
        while(k-->0){
            while(i<capital.length && project[i][0]<=w){
                pq.add(project[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                break;
            }
            w+=pq.poll();
        }
        return w;
    }
}