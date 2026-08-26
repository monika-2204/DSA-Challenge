class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int count =0;
        int low = 0;
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            if(ch=='1'){
                count++;
            }
            while(count>k){
                if(s.charAt(low)=='1'){
                    count--;
                }
                low++;
            }
            if(count==k){
                while(low<=high && s.charAt(low) =='0'){
                    low++;
                    }
                    String curr = s.substring(low,high+1);
                    if(ans.equals("") || curr.length()<ans.length() || (curr.compareTo(ans)<0) && curr.length()==ans.length()){
                        ans = curr;
                        }
                    }
        }

        return ans;
    }
}