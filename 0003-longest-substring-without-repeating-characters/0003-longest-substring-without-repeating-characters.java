class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high =0;
        int max = 0;
        HashSet <Character> set = new HashSet<>();
        for(high = 0;high<s.length();high++){
            char si = s.charAt(high);
            while(set.contains(si)){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(si);
            int len = high -low+1;
            max = Math.max(max,len);
        }
        return max;
    }
}