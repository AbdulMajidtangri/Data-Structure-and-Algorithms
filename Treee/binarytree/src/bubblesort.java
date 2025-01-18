public class bubblesort {
    public static void bubblesort(int arr[], int n, int end) {
        if (n == end) {
            return;
        }
        if (n < end - 1) {
            if (arr[n] > arr[n + 1]) {
                int t = arr[n];
                arr[n] = arr[n + 1];
                arr[n + 1] = t;
            }
            bubblesort(arr, n + 1, end);
        }
        bubblesort(arr, n, end - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 7, 6, 9, 1 };
        bubblesort(arr, 0, arr.length);
        for (int o : arr) {
            System.out.print(o + " ");
        }
    }
}
