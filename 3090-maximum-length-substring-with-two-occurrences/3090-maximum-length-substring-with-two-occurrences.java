class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];  // frequency of each character
        int left = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            // shrink window until valid
            while (freq[s.charAt(right) - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
