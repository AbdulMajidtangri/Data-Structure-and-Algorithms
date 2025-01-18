
class graph{
  static class Node{
    int vertex;
    int weight;
    Node next;
    Node(int vertex,int weight){
        this.weight = weight;
        this.vertex = vertex;
        this.next = null;
    }
  }  
  Node[]adjlist;
  int vertices;
  graph(int vertices){

    this.vertices = vertices;
    adjlist = new Node[vertices];

}
public void addEdges(int source,int destination,int weight){
    Node newnode = new Node(destination,weight);
    newnode.next = adjlist[source];
    adjlist[source] = newnode;

    newnode = new Node(source, weight);
    newnode.next = adjlist[destination];
    adjlist[destination] = newnode;
}
public void printGraph(){
    for(int i=1;i<vertices;i++){
        System.out.print("Vertex : "+i+"-> ");
        Node temp = adjlist[i];
        while (temp != null) {
            System.out.print(" "+temp.vertex+" ( weight  "+temp.weight+" )");
            temp= temp.next;
        }
        System.out.println();
    }
}
}
public class adjacenlist {
    public static void main(String[] args) {
        graph g1 = new graph(5);
        g1.addEdges(1,2,34);
        g1.addEdges(1,3,43);
        g1.addEdges(2,3,34);
        g1.addEdges(2,4,12);
        g1.printGraph();
    }
}
