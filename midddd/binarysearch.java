import java.lang.annotation.Target;

public class binarysearch {
    public  static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(array[mid]==target){
                return array[mid];
            }
            else if(array[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
          
        }
     return -1; }
     public static int occuranceofelemnet(int []arr,int target){
        int low = 0;
        int high = arr.length-1;
        int count = 0;
        while (low<=high) {
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                count++;
                int left = mid-1;
                int right = mid+1;
                while(left > low && arr[left]==target){
                    count++;
                    left--;

                }
                while(right <high && arr[right ]==target){
                    count++;right++;
                }
                return count;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
     }
     public static int binarySearchin2darray(int [][]arr,int target){
        int roww = arr.length;
        int coll = arr[0].length;
        int low = 0;
        int high = roww*coll-1;
        while (low<= high) {
            int mid = low + (high - low)/2;
          int row = mid/coll;
          int col = mid%coll;
          if(arr[row][col]== target){
            return mid;
          }
          else if(arr[row][col]<target){
            low = mid +1;
          }
          else{
            high = mid-1;
          }

        }
        return -1;
     }
    public static void main(String[] args) {
        // int []arr = {1,2,3,3,3,5,5,5,7,8,9};
        int arr[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        int target = 3;
        // int result = binarySearch(arr, target);
        // int result = occuranceofelemnet(arr, target);
        int result = binarySearchin2darray(arr, target);
        System.out.println(result);
    }
}
