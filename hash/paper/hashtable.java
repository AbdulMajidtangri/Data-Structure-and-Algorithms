package paper;
import java.util.LinkedList;
class Table {
    int tablesize;
    LinkedList<Object>[] arr;

    Table(int size) {
        this.tablesize = size; // Initialize tablesize
        arr = new LinkedList[size];
        for (int i = 0; i < tablesize; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    public void insert(Object key) {
        if (loadFactorExceeded()) {
            rehash();
        }

        int index = hashfunction(key);
        arr[index].add(key);
    }

    public void delete(Object key) {
        int index = hashfunction(key);
        arr[index].remove(key);
    }

    public boolean search(Object key) {
        int index = hashfunction(key);
        return arr[index].contains(key);
    }

    public int hashfunction(Object key) {
        return Math.abs(key.hashCode()) % tablesize;
    }

    // Rehashing logic
    private void rehash() {
        System.out.println("Rehashing...");
        // Save current array
        LinkedList<Object>[] oldArr = arr;

        // Double the size of the hash table
        tablesize = tablesize * 2;
        arr = new LinkedList[tablesize];
        for (int i = 0; i < tablesize; i++) {
            arr[i] = new LinkedList<>();
        }

        // Reinsert all elements into the new array
        for (LinkedList<Object> bucket : oldArr) {
            for (Object key : bucket) {
                int newIndex = hashfunction(key);
                arr[newIndex].add(key);
            }
        }
    }

    // Check if the load factor exceeds a certain threshold
    private boolean loadFactorExceeded() {
        int numElements = 0;
        for (LinkedList<Object> bucket : arr) {
            numElements += bucket.size();
        }
        double loadFactor = (double) numElements / tablesize;
        return loadFactor > 0.7; // Threshold for rehashing
    }
    public void printlist() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println("Bucket " + i + ": " + arr[i]);
        }
    }
}
public class hashtable {
    public static void main(String[] args) {
        Table t1 = new Table(5);
        t1.insert(34);
        t1.insert(44);
        t1.insert(54);
        t1.insert(64);
        t1.insert(74); // Should trigger rehash
        t1.insert(84);

        t1.printlist();

        System.out.println("Searching for 44: " + t1.search(44));
        System.out.println("Searching for 99: " + t1.search(99));

        t1.delete(44);
        System.out.println("After deleting 44:");
        t1.printlist();
    }
}
