//package Graph;

import java.util.*;
class DijkstraAlgo {
    static class Pair {
        int node, weight;
        Pair(int n, int w) {
            node = n;
            weight = w;
        }
    }

    public static int[] dijkstra(int V, List<List<Pair>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int u = cur.node;
            int d = cur.weight;

            if (d > dist[u]) continue; // skip outdated entry

            for (Pair edge : adj.get(u)) {
                int v = edge.node;
                int w = edge.weight;

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Graph edges: u -> v (weight)
        adj.get(0).add(new Pair(1, 9));
        adj.get(0).add(new Pair(2, 6));
        adj.get(0).add(new Pair(3, 5));
        adj.get(0).add(new Pair(4, 3));
        adj.get(2).add(new Pair(1, 2));
        adj.get(2).add(new Pair(3, 4));

        int[] dist = dijkstra(V, adj, 0);

        System.out.println("Shortest distances from source 0:");
        System.out.println(Arrays.toString(dist));
    }
}
