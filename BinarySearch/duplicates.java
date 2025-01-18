public class duplicates {
    public static int search1d(int arr[], int head, int tail, int target) {
        int count = 0;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (arr[mid] == target) {
                count++;
                int l = mid - 1;
                while (l >= head && arr[l] == target) {
                    count++;
                    l--;
                }
            int   r = mid + 1;
                while (r <= tail && arr[r] == target) {
                    count++;
                    r++;    
                }
                 return count;
                } else if (arr[mid] < target) {
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3,4,5};
        int head = 0;
        int tail = arr.length - 1;
        int target = 3;
        long start = System.nanoTime();
        int ans = search1d(arr, head, tail, target);
        long end = System.nanoTime();
       System.out.println(ans);
        System.out.println("The time taken: " + (end - start) );
    }
}
