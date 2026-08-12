class Solution {
    class pair{
        int capital;
        int profit;
        pair(int c,int p){
            this.capital = c;
            this.profit = p;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        ArrayList<pair> projects = new ArrayList<>();
        for(int i=0;i<n;i++){
            projects.add(new pair(capital[i],profits[i]));
        }
        Collections.sort(projects,(a,b)-> a.capital-b.capital);
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            while(i<n && projects.get(i).capital <= w){
                pq.add(projects.get(i).profit);
                i++;
            }
            if(pq.isEmpty()){
                break;
            }
            w += pq.peek();
            pq.poll();
        }
        return w;
    }
}