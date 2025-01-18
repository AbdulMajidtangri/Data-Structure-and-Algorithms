class heap {
    static int arr[] = new int[100];
    static int size = 0;

    heap() {
        arr[0] = -1;
        size = 0;
    }
    static void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;
        while (index > 1)  {
            int parent = index / 2;
            if (arr[parent] > arr[index]) {
                swap(parent, index);
                index = parent;
            } else {
                return;
            }
        }
    }
    public static void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

public class heaps {
    public static void main(String[] args) {
        heap.insert(1);
        heap.insert(10);
        heap.insert(7);
        heap.insert(-2);
        heap.print();
    }
}
