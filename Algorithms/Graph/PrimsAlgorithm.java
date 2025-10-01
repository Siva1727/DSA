import java.util.*;

class PrimsAlgorithm {
    
    static class Pair {
        int node;
        int weight;
        Pair(int n, int w) {
            node = n;
            weight = w;
        }
    }

    public static int primsMST(int n, int[][] edges) {
        // Build adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        // Visited array
        boolean[] vis = new boolean[n];

        // Min-Heap based on edge weight
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(0, 0));  // Start from node 0 with weight 0

        int sum = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < n) {
            Pair cur = pq.poll();
            int node = cur.node;
            int wt = cur.weight;

            if (vis[node]) continue;

            // Take this edge
            vis[node] = true;
            sum += wt;
            edgesUsed++;

            // Push all adjacent edges
            for (int[] nb : adj.get(node)) {
                if (!vis[nb[0]]) {
                    pq.add(new Pair(nb[0], nb[1]));
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
            {0, 1, 5},
            {1, 2, 3},
            {0, 2, 1}
        };

        int mstWeight = primsMST(n, edges);
        System.out.println("Weight of MST: " + mstWeight);
    }
}
