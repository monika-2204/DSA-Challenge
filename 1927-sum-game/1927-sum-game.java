class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int first = n/2;

        int leftsum = 0;
        int leftcount = 0;
        for(int i=0;i<first;i++){
            if(num.charAt(i)=='?'){
                leftcount++;
            }else
            leftsum += num.charAt(i) - '0';
        }

        int rightsum = 0;
        int rightcount = 0;
        for(int i=first;i<n;i++){
            if(num.charAt(i)=='?'){
                rightcount++;
            }else
            rightsum += num.charAt(i) - '0';
        }

        if((rightcount+leftcount) % 2 == 1){
            return true;
        }
        int diff = leftsum-rightsum;
        int qdiff = rightcount - leftcount;
        return diff != (qdiff * 9)/2;
    }
}