class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> ans = new ArrayList<>();
        if(tomatoSlices<cheeseSlices || tomatoSlices%2!=0) {
            return ans;
        }
        else {
            int j = tomatoSlices/2-cheeseSlices;
            int s = cheeseSlices - j;
            if(j<0 || s<0) return ans;
            ans.add(j);
            ans.add(s);
            }
        return ans;
    }
}