class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int fuel = startFuel;
        int stop = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while(fuel<target){
            while(i<stations.length && stations[i][0] <= fuel){
                pq.add(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            fuel += pq.poll();
            stop++;
        }
        return stop;
    }
}