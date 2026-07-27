class Solution {
    public int days(int guess, int[] bloomDay, int k) {
        int bouquet = 0;
        int flower = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= guess) {   // fix: <= not <
                flower++;
                if (flower == k) {
                    bouquet++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }
        }
        return bouquet;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1; // not enough flowers

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // find min and max bloom days
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int res = -1;
        while (low <= high) {
            int guess = low + (high - low) / 2;
            if (days(guess, bloomDay, k) >= m) {
                res = guess;        // possible answer
                high = guess - 1;   // try smaller days
            } else {
                low = guess + 1;    // need more days
            }
        }
        return res;
    }
}
