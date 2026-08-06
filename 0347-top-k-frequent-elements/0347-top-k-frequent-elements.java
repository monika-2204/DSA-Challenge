class Solution {
    class pair{
        int freq ;
        int num;
        pair(int f,int s){
            this.freq = f;
            this.num = s;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.freq != b.freq)
                   return a.freq-b.freq;
                return a.num-b.num;
            }
        );
        int result[] = new int[k];
        int id =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key:map.keySet()){
            pq.add(new pair(map.get(key),key));
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            result[id++]=pq.poll().num;
        }
        return result;
    }
}