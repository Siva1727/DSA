import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>bfs = new ArrayList<>();
        Queue<Integer>qu = new LinkedList<>();
        boolean visited[] = new boolean[adj.size()];
        qu.add(0);
        visited[0] = true ;
        while(!qu.isEmpty()){
            int el = qu.poll();
            bfs.add(el);
            for(int i : adj.get(el)){
                if(!visited[i]){
                    qu.add(i);
                    visited[i] = true;
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int nodes = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (directed or undirected as needed)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(3).add(5);
        adj.get(4).add(5);

        // Run BFS
        BFS obj = new BFS();
        ArrayList<Integer> result = obj.bfs(adj);

        // Print result
        System.out.println("BFS Traversal: " + result);
    }
}
