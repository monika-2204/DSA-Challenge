import java.util.*;

class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) count[d]++;
        Set<Integer> set = new HashSet<>();

        for (int num = 100; num <= 999; num += 2) {
            int[] temp = Arrays.copyOf(count, 10);
            int x = num;
            boolean valid = true;
            for (int i = 0; i < 3; i++) {
                int d = x % 10;
                if (temp[d] == 0) {
                    valid = false;
                    break;
                }
                temp[d]--;
                x /= 10;
            }
            if (valid) set.add(num);
        }
        return set.size();
    }
}