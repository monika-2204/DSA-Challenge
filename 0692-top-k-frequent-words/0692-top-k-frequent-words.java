class Solution {
    class pair{
        int freq ;
        String word;
        pair(int f,String s){
            this.freq = f;
            this.word = s;
    }
}
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i= 0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
            if(a.freq!=b.freq)
                return a.freq-b.freq;
            return b.word.compareTo(a.word);
        });
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            pair curr = new pair(entry.getValue(),entry.getKey());
            if(pq.size()<k){
                pq.add(curr);
            }else if(curr.freq > pq.peek().freq || (curr.freq == pq.peek().freq && curr.word.compareTo(pq.peek().word) < 0)){
                pq.poll();
                pq.add(curr);
            }
            
        }
        List<String> result = new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll().word);
        }
        Collections.reverse(result);

        return result;
    }
}