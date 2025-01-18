package Graphs;

class Graphh{
    int vertices;
    WeightedNode []ajcencylist;
   Node WeightedNode[];
    Graphh(int vertices){
        this.vertices = vertices;
        ajcencylist = new WeightedNode[vertices];

    }
    void addEdges(int source,int destination,int weight){
        WeightedNode newnode = new WeightedNode(destination, weight);
        newnode.next = ajcencylist[source];
        ajcencylist[source] = newnode;

        WeightedNode newnode2 = new WeightedNode(source,weight);
        newnode2.next = ajcencylist[destination];
        ajcencylist[destination] = newnode2;
    }
    void printAll(){
        for(int i=0;i<vertices;i++){
            System.out.print("Vertices are "+i+" :");
            WeightedNode temp = ajcencylist[i];
  while (temp != null) {
    System.out.print(" -> "+temp.vertex+", Weight : "+temp.weight);

    temp = temp.next;

  }
  System.out.println();
        }
    }
}
public class AllGraph {
public static void main(String[] args) {
    Graphh g = new Graphh(4);
    g.addEdges(0, 1,34);
    g.addEdges(0, 2,34);
    g.addEdges(2, 3,12);
    g.addEdges(1, 3,55);
    g.printAll();
}    
}
