class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices<cheeseSlices || tomatoSlices%2!=0) {
            return new ArrayList<>();
        }
        int j = tomatoSlices/2-cheeseSlices;
        int s = cheeseSlices - j;
        if(j<0 || s<0) return new ArrayList<>();
        return Arrays.asList(j,s); 
    }
}