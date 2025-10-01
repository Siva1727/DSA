import java.util.Arrays;

public class BellmanFord {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int INF = 100000000; // safer than using (int)(1e8)
        int dist[] = new int[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];
                int w = edge[2];
                if (dist[a] != INF && dist[a] + w < dist[b]) {
                    dist[b] = dist[a] + w;
                }
            }
        }

        // Check for negative weight cycle
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int w = edge[2];
            if (dist[a] != INF && dist[a] + w < dist[b]) {
                return new int[]{-1};
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        // Example usage:
        int V = 5;
        int[][] edges = {
            {0, 1, -1},
            {0, 2, 4},
            {1, 2, 3},
            {1, 3, 2},
            {1, 4, 2},
            {3, 2, 5},
            {3, 1, 1},
            {4, 3, -3}
        };
        BellmanFord bf = new BellmanFord();
        int[] result = bf.bellmanFord(V, edges, 0);

        System.out.println(Arrays.toString(result));
    }
}
