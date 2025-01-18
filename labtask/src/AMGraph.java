class AMGraph {
    private int[][] adjacencyMatrix;
    private int vertices;
    int a[];

    // Constructor to initialize the graph with a specified number of vertices
    public AMGraph(int vertice[]) {
        this.vertices = vertice.length;
        a = new int[vertices];
        System.arraycopy(vertice, 0, a, 0, vertices);
        adjacencyMatrix = new int[vertices][vertices]; // Initialize matrix with 0s
    }

    // Method to add an undirected edge between two vertices
    public void addEdge(int source, int destination) {
        int s = check(source), s2 = check(destination);
        if (s == 1 && s2 == 1) {
            adjacencyMatrix[source][destination] = 1; // Set the edge from source to destination
            adjacencyMatrix[destination][source] = 1; // Set the edge from destination to source (since undirected)
        } else {
            adjacencyMatrix[source][destination] = 0; // Set the edge from source to destination
            adjacencyMatrix[destination][source] = 0; // Set the edge from destination to source (since undirected)
        }

    }

    private int check(int source) {
        for (int i = 0; i < vertices; i++) {
            if (a[i] == source) {
                return 1;
            }
        }
        return 0;
    }

    // Method to print the adjacency matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printGraph2() {
        System.out.println("Adjacency Matrix:");
        for (int e[] : adjacencyMatrix) {
            for (int y : e) {
                System.out.print(y + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        AMGraph graph = new AMGraph(arr); // Create a graph with 4 vertices
        graph.addEdge(0, 1); // Add edge between vertex 0 and 1
        graph.addEdge(0, 2); // Add edge between vertex 0 and 2
        graph.addEdge(1, 2); // Add edge between vertex 1 and 2
        graph.addEdge(2, 3); // Add edge between vertex 2 and 3

        graph.printGraph(); // Display the adjacency matrix of the graph
    }
}
