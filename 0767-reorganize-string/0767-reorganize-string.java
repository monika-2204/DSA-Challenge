class Solution {
    class pair {
        int freq;
        char letter;
        pair(int f, char s) {   // fixed constructor to accept char
            this.freq = f;
            this.letter = s;
        }
    }

    public String reorganizeString(String s) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Step 2: Max-heap based on frequency
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getValue(), entry.getKey()));
        }

        // Step 3: Build result string using seat index
        StringBuilder res = new StringBuilder();
        int seat = 0;

        while (!pq.isEmpty()) {
            pair curr = pq.poll();

            // If current letter is same as last placed, pick next available
            if (seat > 0 && res.charAt(seat - 1) == curr.letter) {
                if (pq.isEmpty()) return ""; // impossible case
                pair next = pq.poll();
                res.append(next.letter);
                seat++;
                next.freq--;
                if (next.freq > 0) pq.add(next);
                pq.add(curr); // put curr back
            } else {
                res.append(curr.letter);
                seat++;
                curr.freq--;
                if (curr.freq > 0) pq.add(curr);
            }
        }

        return res.toString();
    }
}
