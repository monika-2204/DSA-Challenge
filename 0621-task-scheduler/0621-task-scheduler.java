class Solution {
    class Pair {
        int freq;
        char task;
        Pair(int f, char t) {
            this.freq = f;
            this.task = t;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        int[] freqArr = new int[26];
        for (char c : tasks) {
            freqArr[c - 'A']++;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] > 0) {
                pq.add(new Pair(freqArr[i], (char) ('A' + i)));
            }
        }

        int time = 0;
        int[] free = new int[26];

        while (!pq.isEmpty()) {
            ArrayList<Pair> pulled = new ArrayList<>();
            boolean executed = false;

            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                int freq = p.freq;
                char task = p.task;

                if (free[task - 'A'] <= time) {
                    if (freq > 1) {
                        pulled.add(new Pair(freq - 1, task));
                    }
                    free[task - 'A'] = time + n + 1;
                    executed = true;
                    break;
                } else {
                    pulled.add(p);
                }
            }

            for (Pair p : pulled) {
                pq.add(p);
            }

            time++;
            if (!executed && !pq.isEmpty()) {
                continue;
            }
        }
        return time;
    }
}