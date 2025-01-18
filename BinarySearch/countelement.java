public class countelement {
    public static int countElement(int[] arr, int target) {
        int low = 0;
    int high = arr.length-1;
    int count = 0;
    while (low<=high) {
        int mid = (low + high)/2;
        if(arr[mid]==target){
            count++;
           int left  = mid-1;
           while (left>=low && arr[left]==target) {
            count++;
            left--;
           }
           int right  = mid+1;
           while (right<=high && arr[right]==target) {
            count++;
            right++;
           }
            return count;
        }
            
            else if(mid<target){
    low = mid + 1;
            }
            else{
                high = mid  -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,3,3, 3,4,5};
        int target = 3;
        int count = countElement(arr, target);
    System.out.println(count);
    }
}