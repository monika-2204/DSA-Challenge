class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int t = target.charAt(i) - 'a';
            if (freq[t] > 0) {
                freq[t]--;
                if (canBeat(freq.clone(), target.substring(i + 1))) {
                    ans.append((char)(t + 'a'));
                    continue;
                }
                freq[t]++;
            }
            for (int c = t + 1; c < 26; c++) {
                if (freq[c] > 0) {
                    ans.append((char)(c + 'a'));
                    freq[c]--;
                    for (int j = 0; j < 26; j++) {
                        while (freq[j]-- > 0) ans.append((char)(j + 'a'));
                    }
                    return ans.toString();
                }
            }
            return "";
        }
        return "";
    }

    private boolean canBeat(int[] freq, String suffix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            for (int k = 0; k < freq[i]; k++) sb.append((char)(i + 'a'));
        }
        return sb.toString().compareTo(suffix) > 0;
    }
}