class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int []indeg = new int[numCourses];
        
        for(int i=0;i<prerequisites.length;i++){
            int []a = prerequisites[i];
            int src = a[1];
            int des = a[0];
            adj.get(src).add(des);
            indeg[des]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int p = q.poll();
            ans.add(p);
            for(int k=0;k<adj.get(p).size();k++){
                int neigh = adj.get(p).get(k);
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        return ans.size()==numCourses;
    }
}