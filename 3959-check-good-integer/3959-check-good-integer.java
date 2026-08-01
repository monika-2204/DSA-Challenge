class Solution {
    public boolean checkGoodInteger(int n) {
        boolean f = false;
        int sum = 0;
        int sq =0;
        while(n>0){
            int tem = n%10;
            sum += tem;
            sq += tem*tem;
            n= n/10;
        }
        if(sq-sum>=50){
            f = true;
        }
        return f;
    }
}