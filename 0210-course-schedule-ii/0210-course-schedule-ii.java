class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int []res = new int[numCourses];
        int []indeg = new int[numCourses];
        Arrays.fill(res,-1);

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int []a = prerequisites[i];
            int first = a[1];
            int second = a[0];
            adj.get(first).add(second);
            indeg[second]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int d = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            res[d] = node;
            d++;
            for(int k=0;k<adj.get(node).size();k++){
                int neigh = adj.get(node).get(k);
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if(d!=numCourses){
            return new int[0];
        }
        return res;
    }
}