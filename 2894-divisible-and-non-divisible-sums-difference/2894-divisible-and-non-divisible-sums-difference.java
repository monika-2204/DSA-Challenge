class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int nondiv = 0;

        for(int i=1;i<=n;i++){
            if(i%m==0){
                div += i;
            }else{
                nondiv += i;
            }
        }
        return nondiv-div;
    }
}