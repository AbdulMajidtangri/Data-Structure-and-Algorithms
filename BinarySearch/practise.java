public class practise {
    public static int bsearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (arr[mid] == target) {
            return mid;

        }

        else if (arr[mid] < target) {
            return bsearch(arr, target, mid + 1, high);
        }

        else {
            return bsearch(arr, target, low, mid - 1);
        }
    }

    public static int bsearchduplicate(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        } 
        int count = 0;  // to keep count of occurrences of target in the array
        int mid = (high + low) / 2;
        if (arr[mid] == target) {
          count++;
            int left = mid - 1;
            int right = mid + 1;
            while (left >= low && arr[left] == target ) {
                left--;
                count++;
            }
            
            while (right <= high && arr[right] == target) {
                right++;
                count++;
            }
            return count;
        } else if (arr[mid] < target) {
            return bsearchduplicate(arr,target,mid+1,high);
        } else {
            return bsearchduplicate(arr,target,low,mid-1);        }
    }
public static int bserachmatrix(int [][]arr,int target){
  int row = arr.length;
  int col = arr[0].length;
  for(int i=0;i<row;i++){
if(arr[i][0]<= target && arr[i][col-1]>=target){
    int low = 0;
    int high = (col-1);
    while (low<=high) {
        int mid = (low + high)/2;
        if(arr[i][mid]== target){
   return mid;
        }
        else if(arr[i][mid]<target){
            low = mid +1;
        }
        else{
            high = mid - 1;
        }
    }
}
  }
  return -1;
}
public static int bserachmatrix2(int [][]arr,int target){
    int row = arr.length;
    int col = arr[0].length;
    int low = 0;
    int high = row*col-1;
    while (low<=high) {
        int mid = (low + high)/2;
        int r = mid/row;
        int c = mid%col;
        if(arr[r][c]==target){
            return c;
        }
        else if(arr[r][c]<target){
            low = mid+1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        // starting the binary search from the starting to the end
        int arr[][] = {{1,2,3},{4,5,6}};
        int target =6 ;
        long start = System.nanoTime();
        // int p = bsearch(arr, target, low, high);
        // int dup = bsearchduplicate(arr, target, low, high);
        int m = bserachmatrix(arr,target);
        long end = System.nanoTime();
        System.out.println(m);
        System.out.println(end - start);
    }
}