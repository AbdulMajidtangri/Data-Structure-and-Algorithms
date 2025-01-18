public class heapsort {
    // Main heap sort function
    public static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2;

        while (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        while (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr[i], arr[largest]);
            heapify(arr, n, largest);
        }
    }

    public static void swap( int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        heapSort(arr);

        System.out.println("Sorted array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
