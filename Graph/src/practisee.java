class Graph {
    int size;
    boolean adjMatrix[][];
    String vertices[];

    Graph(String ar[]) {
        size = ar.length;
        vertices = new String[size];
        for (int i = 0; i < size; i++) {
            vertices[i] = ar[i];
        }
        adjMatrix = new boolean[size][size];
    }

    public void add(int v1, int v2) {
        boolean validV1 = check(v1);
        boolean validV2 = check(v2);

        if (validV1 && validV2 && v1 != v2) {
            adjMatrix[v1][v2] = true;
            adjMatrix[v2][v1] = true;
        } else {
            System.out.println("Invalid vertex");
        }
    }

    private boolean check(int v) {
        return v >= 0 && v < size;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class practisee {
    public static void main(String[] args) {
        String[] arr = {"0", "1", "2", "3"};
        Graph g1 = new Graph(arr);
        g1.add(0, 1);
        g1.add(0, 3);
        g1.add(1, 2);
        g1.add(3, 2);
        g1.printMatrix();
    }
}
