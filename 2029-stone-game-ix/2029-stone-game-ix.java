class Solution {
    public boolean stoneGameIX(int[] stones) {
        int s1 = 0,s2=0,s3=0;
        for(int i=0;i<stones.length;i++){
            if(stones[i]%3==0){
                s1++;
            }else if(stones[i]%3==1){
                s2++;
            }else{
                s3++;
            }
        }
        if(s1%2==0){
            return s2>=1 && s3>=1;
        }else{
            return Math.abs(s2-s3)>=3;
        }
    }
}