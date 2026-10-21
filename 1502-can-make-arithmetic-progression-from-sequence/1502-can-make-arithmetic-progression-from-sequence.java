class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for(int i=2;i<arr.length;i++){
            int d = Math.abs(arr[i]-arr[i-1]);
            if(d != Math.abs(diff)) return false;
        }
        return true;
    }
}