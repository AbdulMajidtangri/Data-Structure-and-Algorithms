class Graph {
    int size;
    String[] vertices;
    boolean[][] adjMatrix;

    public Graph(String[] arr) {
        size = arr.length;
        vertices = new String[size];
        for (int i = 0; i < size; i++) {
            vertices[i] = arr[i];
        }
        adjMatrix = new boolean[size][size];
    }

    public void add(String v1, String v2) {
        int i = index(v1), j = index(v2);
        adjMatrix[i][j] = true;
    }

    private int index(String v) {
        for (int i = 0; i < size; i++) {
            if (vertices[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        if (size == 0) return "";
        StringBuilder sb = new StringBuilder("{" + vertex(0));
        for (int i = 1; i < size; i++) {
            sb.append(":" + vertex(i));
        }
        return sb + "}";
    }

    private String vertex(int i) {
        StringBuffer sb = new StringBuffer(vertices[i] + ":");
        for (int k = 0; k < size; k++) {
            if (adjMatrix[i][k]) {
                sb.append(vertices[k]);
            }
        }
        return sb + "";
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((adjMatrix[i][j] ? "1" : "0") + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        Graph g1 = new Graph(arr);
        g1.add("A", "B");
        g1.add("A", "C");
        g1.add("A", "D");
        g1.add("B", "A");
        g1.add("B", "D");
        g1.add("C", "A");
        g1.add("C", "D");
        g1.add("D", "A");
        g1.add("D", "B");
        g1.add("D", "C");
        g1.add("D", "E");
        g1.add("E", "D");
System.out.println(g1.toString());
        // g1.print();
    }
}
