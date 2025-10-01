import java.util.*;

class Kruskal {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;
        Edge(int s, int d, int w) {
            src = s; dest = d; weight = w;
        }
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static int find(int parent[], int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]); // path compression
    }

    static void union(int parent[], int rank[], int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);

        if (rank[xroot] < rank[yroot]) {
            parent[xroot] = yroot;
        } else if (rank[xroot] > rank[yroot]) {
            parent[yroot] = xroot;
        } else {
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }

    static void kruskalMST(int V, List<Edge> edges) {
        Collections.sort(edges); // step 1: sort edges

        int parent[] = new int[V];
        int rank[] = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        List<Edge> result = new ArrayList<>();
        int e = 0, i = 0;

        while (e < V - 1 && i < edges.size()) {
            Edge next = edges.get(i++);
            int x = find(parent, next.src);
            int y = find(parent, next.dest);

            if (x != y) { // no cycle
                result.add(next);
                e++;
                union(parent, rank, x, y);
            }
        }

        System.out.println("Edges in MST:");
        int totalWeight = 0;
        for (Edge edge : result) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
            totalWeight += edge.weight;
        }
        System.out.println("Total Weight: " + totalWeight);
    }

    public static void main(String[] args) {
        int V = 4; // number of vertices
        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 1));
        edges.add(new Edge(0, 2, 2));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(2, 3, 4));
        edges.add(new Edge(1, 3, 5));

        kruskalMST(V, edges);
    }
}
