package Graphs;

class DirectedWeightedGraph {
    private WeightedNode[] adjacencyList;
    private int vertices;

    public DirectedWeightedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new WeightedNode[vertices];
    }

    public void addEdge(int source, int destination, int weight) {
        WeightedNode node = new WeightedNode(destination, weight);
        node.next = adjacencyList[source];
        adjacencyList[source] = node;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            WeightedNode temp = adjacencyList[i];
            while (temp != null) {
                System.out.print(" -> (" + temp.vertex + ", weight=" + temp.weight + ")");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedWeightedGraph graph = new DirectedWeightedGraph(4);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 3, 3);
        graph.addEdge(2, 3, 5);

        graph.printGraph();
    }
}
