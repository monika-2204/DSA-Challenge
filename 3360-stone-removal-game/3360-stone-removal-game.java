class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int num = 10;
         while(true){
            if(n<num) break;
            n = n-num;
            num--;
         }
         if(num%2==0){
            return false;
         }else
         return true;
    }
}