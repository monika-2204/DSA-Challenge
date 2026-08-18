class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> windowFreq = new HashMap<>();
        Map<Integer, Integer> globalCount = new HashMap<>();

        for (int i = 0; i < k; i++) {
            windowFreq.put(nums[i], windowFreq.getOrDefault(nums[i], 0) + 1);
        }
        for (int num : windowFreq.keySet()) {
            globalCount.put(num, globalCount.getOrDefault(num, 0) + 1);
        }

        for (int i = k; i < n; i++) {
            int out = nums[i - k];
            int in = nums[i];

            windowFreq.put(out, windowFreq.get(out) - 1);
            if (windowFreq.get(out) == 0) windowFreq.remove(out);

            windowFreq.put(in, windowFreq.getOrDefault(in, 0) + 1);

            for (int num : windowFreq.keySet()) {
                globalCount.put(num, globalCount.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;
        for (int num : globalCount.keySet()) {
            if (globalCount.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}
