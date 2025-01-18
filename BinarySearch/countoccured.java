public class countoccured {
    public static int count(int[] arr, int low, int high, int ele) {
        int an = -1;
        while (low <= high) {
            int mid =  (low  + high)/2;
            if (arr[mid] == ele) {
                an = mid;
                high = mid - 1;
            } else if (arr[mid] < low) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return an;
    }
    public static int count2(int[] arr, int low, int high, int ele) {
        int an = -1;
        while (low <= high) {
            int mid = (low  + high)/2;
            if (arr[mid] == ele) {
                an = mid;
                low = mid +1;
            } else if (arr[mid] < low) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return an;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 4 };
        
        System.out.println(count(arr, 0, arr.length-1, 3));
        System.out.println(count2(arr, 0, arr.length-1, 3));
         
        // int a2 = count(arr, 0, arr.length-1, 3);
        // int find = a2  -a1;
        // System.out.println(find);
    }
}
