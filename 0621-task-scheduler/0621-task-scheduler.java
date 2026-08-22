class Solution {
    class pair {
        int freq;
        char task;
        pair(int f, char t) {
            this.freq = f;
            this.task = t;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for (char ch : map.keySet()) {
            pq.add(new pair(map.get(ch), ch));
        }

        int time = 0;
        int[] free = new int[26]; // cooldown tracker

        while (!pq.isEmpty()) {
            ArrayList<pair> pulled = new ArrayList<>();
            boolean executed = false;

            while (!pq.isEmpty()) {
                pair p = pq.poll();
                int freq = p.freq;
                char task = p.task;

                if (free[task - 'A'] <= time) {
                    // execute task
                    if (freq > 1) {
                        pulled.add(new pair(freq - 1, task));
                    }
                    free[task - 'A'] = time + n + 1;
                    executed = true;
                    break;
                } else {
                    pulled.add(p);
                }
            }

            for (pair p : pulled) {
                pq.add(p);
            }

            time++;
            if (!executed && !pq.isEmpty()) {
                // idle time
                continue;
            }
        }
        return time;
    }
}