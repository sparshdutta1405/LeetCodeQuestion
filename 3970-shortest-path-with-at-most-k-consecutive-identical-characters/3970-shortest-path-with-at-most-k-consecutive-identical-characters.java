import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        if (k < 1) return -1;
        if (n == 1) return 0;

        
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            adj[e[0]].add(new int[]{e[1], e[2]});
        }

        
        int[][] dist = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0];
            int u = top[1];
            int consec = top[2];

            
            if (u == n - 1) {
                return d;
            }

            if (d > dist[u][consec]) {
                continue;
            }

            char uChar = labels.charAt(u);

            for (int[] edge : adj[u]) {
                int v = edge[0];
                int weight = edge[1];
                char vChar = labels.charAt(v);

                int nextConsec = (uChar == vChar) ? (consec + 1) : 1;

                
                if (nextConsec <= k) {
                    if (d + weight < dist[v][nextConsec]) {
                        dist[v][nextConsec] = d + weight;
                        pq.offer(new int[]{dist[v][nextConsec], v, nextConsec});
                    }
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna