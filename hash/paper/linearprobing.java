package paper;

public class linearprobing {
    private int size;
    private int[] arr;
    private int count; // Tracks the number of elements in the hash table
    private final double loadFactorThreshold = 0.75; // Load factor threshold for rehashing

    public linearprobing(int size) {
        this.size = size;
        arr = new int[size];
        count = 0;
    }

    private int hashfunction(int key) {
        return key % size;
    }

    public void insert(int key) {
        if ((double) count / size >= loadFactorThreshold) {
            rehash();
        }

        int index = hashfunction(key);
        int index2 = index;
        int i = 0;
        while (arr[index] != 0 && arr[index] != -1) { 
            index = (index2 + i*i) % size;
            if (i == size) {
                System.out.println("No space left in the table, even after rehashing");
                return;
            }
        }

        arr[index] = key;
        count++;
    }

    public void delete(int key) {
        int index = hashfunction(key);
        int index2 = index;
        int i = 0;

        while (arr[index] != 0) {
            if (arr[index] == key) {
                arr[index] = -1;
                count--; 
                return;
            }
            index = (index2 + ++i) % size;

            if (i == size) {
                System.out.println("The element does not exist in the table");
                return;
            }
        }
    }

    public boolean search(int key) {
        int index = hashfunction(key);
        int index2 = index;
        int i = 0;

        while (arr[index] != 0) { 
            if (arr[index] == key) {
                return true;
            }
            index = (index2 + ++i) % size;

            if (i == size) {
                break;
            }
        }

        return false;
    }

    private void rehash() {
        int[] oldArr = arr;
        size = size * 2; 
        arr = new int[size];
        count = 0;

        for (int key : oldArr) {
            if (key != 0 && key != -1) { 
                insert(key);
            }
        }

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("Bucket : " + i + " : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        linearprobing lp = new linearprobing(5);
        lp.insert(12);
        lp.insert(22);
        lp.insert(32);
        lp.insert(8);
        lp.insert(10);
        lp.print();

    

        lp.print();
    }
}
