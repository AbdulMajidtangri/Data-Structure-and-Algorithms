public class treehashes {
    int data;
    treehashes left;
    treehashes right;
    private static final treehashes nill = new treehashes();
    private static final int tableesize = 10; 
    private static treehashes[] table;
    private treehashes() {
        this.left = this.right = nill;
    }
    public treehashes(int data) {
        this.data = data;
        this.left = this.right = nill;
    }
    public static int hashFunction(int key) {
        return key % tableesize;
    }
    public static void put(int data) {
        int i = hashFunction(data);
        if (table[i] == null) {
            table[i] = new treehashes(data);
        } else {
            table[i].add(data); 
        }
    }
    public treehashes add(int data) {
        if (this == nill) {
            return new treehashes(data);
        }
        
        if (data < this.data) {
            this.left = this.left.add(data);
        } else if (data > this.data) {
            this.right = this.right.add(data);
        }
        
        return this;
    }

    public static boolean contains(int data) {
        int i = hashFunction(data);

        if (table[i] == null) {
            return false;
        } else {
            return table[i].search(data); 
        }
    }

    private boolean search(int data) {
        if (this == nill) {
            return false;
        }
        
        if (this.data == data) {
            return true;
        } else if (data < this.data) {
            return this.left.search(data);
        } else {
            return this.right.search(data); 
        }
    }

    public void inOrder() {
        if (this == nill) {
            return;
        }
        if (left != nill) left.inOrder();
        System.out.print(data + " ");
        if (right != nill) right.inOrder();
    }

    public static void display() {
        for (int i = 0; i < tableesize; i++) {
            System.out.print("Bucket " + i + ": ");
            if (table[i] != null) {
                table[i].inOrder();
            } else {
                System.out.print("[]");
            }
            System.out.println();
        }
    }

    public static void initializeTable() {
        table = new treehashes[tableesize];
    }

    public static void main(String[] args) {
        initializeTable();

        put(15);
        put(25);
        put(35);
        put(45);
        put(12);  
        put(22);
        put(32);

        System.out.println("Contains 15: " + contains(15));
        System.out.println("Contains 20: " + contains(20)); 

        display();
    }
}
