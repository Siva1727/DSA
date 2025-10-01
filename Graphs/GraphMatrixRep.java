public class GraphMatrixRep {
    private int vertex ;
    private int matrix[][];
    // Constructor
    GraphMatrixRep(int vertex) {
        this.vertex  = vertex;
        matrix = new int[vertex][vertex];
    }

    // Add edge (undirected)
    public void addEdge(int u,int v){
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    // Print the matrix
    public void printGraph(){
        for(int i=0;i<vertex;i++){
            for(int j=0;j<vertex;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        GraphMatrixRep g = new GraphMatrixRep(5);
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
