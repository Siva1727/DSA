import java.util.ArrayList;

public class DFS {

    public void dfsTravel(int node,boolean[]visited,ArrayList<Integer> dfs,ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;
        dfs.add(node);
        for(int i : adj.get(node)){
            if(!visited[i]){
                dfsTravel(i,visited,dfs,adj);
            }
        }
    } 
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean visited[] = new boolean[adj.size()];
        visited[0] = true;
        dfsTravel(0,visited,dfs,adj);
        return dfs;
    }
    public static void main(String[] args) {
        int nodes = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (directed or undirected as needed)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);
        adj.get(2).add(6);


        // Run DFS
        DFS obj = new DFS();
        ArrayList<Integer> result = obj.dfs(adj);

        // Print result
        System.out.println("DFS Traversal: " + result);
    }
}
