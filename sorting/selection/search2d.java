public class search2d {
    public static int search(int arr[][],int target){
        int r = arr.length;
        int c = arr[0].length;
        int head =  0;
        int tail = r*c - 1;
        while (head<=tail) {
            int mid =head + (tail - head)/2;
            int row =  mid/r;
            int col = mid%c;
            if (arr[row][col] == target)
            return 1;
            if (arr[row][col] > target)
            tail = mid - 1;
            else
            head = mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 6;
        System.out.println(search(arr, target));
    }
}
