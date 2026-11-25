import java.util.*;

class Solution {
    private boolean valid(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;
    }

    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(res[i], Integer.MAX_VALUE);
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        res[0][0] = 0;
        pq.add(new int[]{0, 0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int effort = curr[0];
            int row = curr[1];
            int col = curr[2];

            if (row == n - 1 && col == m - 1) {
                return effort;
            }

            if (effort > res[row][col]) {
                continue;
            }

            for (int k = 0; k < 4; k++) {
                int r = row + dr[k];
                int c = col + dc[k];
                if (!valid(r, c, n, m)) {
                    continue;
                }

                int stepDiff = Math.abs(heights[r][c] - heights[row][col]);
                int nextEffort = Math.max(effort, stepDiff);

                if (nextEffort < res[r][c]) {
                    res[r][c] = nextEffort;
                    pq.add(new int[]{nextEffort, r, c});
                }
            }
        }

        return res[n - 1][m - 1];
    }
}