import java.util.*;

public class GraphListRep {
    private int vertex;
    // private ArrayList<Integer>[] adjList;    // array of list
    private ArrayList<List<Integer>> adjList;  // list of list

    // Constructor
    public GraphListRep(int vertex) {
        this.vertex = vertex;
        adjList = new ArrayList<>();

        // Initialize each list for each vertex
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<>());
        }
        // this.vertex = vertex;
        // adjList = new ArrayList[vertex];
        // for (int i = 0; i < vertex; i++) {
        //     adjList[i] = new ArrayList<Integer>(); // ✅ Fixed here
        // }
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);  
        adjList.get(v).add(u);
        // adjList[u].add(v);
        // adjList[v].add(u);
    }

    // Print the graph
    public void printGraph() {
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < vertex; i++) {
        //     System.out.print(i + " -> ");
        //     for (int node : adjList[i]) {
        //         System.out.print(node + " ");
        //     }
        //     System.out.println();
        // }
    }

    // Main method
    public static void main(String[] args) {
        GraphListRep g = new GraphListRep(5);  // Vertices 0 to 4

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
