public class binary01{

    public static int firstoccurance(int arr[],int low,int high,int ele){
        int ans=-1;
        while (low<= high) {
            int mid  = low + (high -low)/2;
            if(arr[mid]==ele){
                ans = mid;
                high= mid -1;
            }
            else if(arr[mid]<ele){
                low = mid +1;
            }   
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static int lastoccurance(int arr[],int low,int high,int ele){
        int ans=-1;
        while (low<= high) {
            int mid  = low + (high -low)/2;
            if(arr[mid]==ele){
                ans = mid;
            low = mid +1;
            }
            else if(arr[mid]<ele){
                low = mid +1;
            }   
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,4,5};
      System.out.println("First Occurrence of 3 : "+firstoccurance(arr, 0, arr.length-1, 3));  
      System.out.println("last Occurrence of 3 : "+lastoccurance(arr, 0, arr.length-1, 3));  
    }
}