import java.util.LinkedList;

public class hash{
    private int TABLE_SIZE = 10;
    private LinkedList<Integer>[] table;

    public hash() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % TABLE_SIZE;
    }

    public void insert(int key) {
        int hash = hashFunction(key);
        table[hash].add(key);
    }

    public boolean search(int key) {
        int hash = hashFunction(key);
        return table[hash].contains(key);
    }

    public void delete(int key) {
        int hash = hashFunction(key);
        table[hash].remove(Integer.valueOf(key));
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Bucket " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
        hash ht = new hash();
        ht.insert(10);
        ht.insert(20);
        ht.insert(15);
        ht.insert(30);
        ht.displayTable();

        System.out.println("Search 15: " + ht.search(15));
        ht.delete(15);
        System.out.println("Search 15 after deletion: " + ht.search(15));
    }
}
