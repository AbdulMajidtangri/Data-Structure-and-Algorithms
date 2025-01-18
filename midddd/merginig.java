
public class merginig {
    public void  mergesort(int arr[],int low,int high){
        int mid = (low + high)/2;
        if(low >= high) return ;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, high,mid);
     }
       public void merge(int arr[],int low,int high,int mid){
     int  left = low;
     int right  =  mid+1;
     int k=0;
     int []temp = new int[high - low +1];
     while (left <= mid && right <= high) {
         if(arr[left]<=arr[right]){
             temp[k++]=arr[left++];
         }
         else{
             temp[k++]=arr[right++];
         }
     }
     while (left <= mid) {
         temp[k++] = arr[left++];
     }
     while (right<= mid) {
         temp[k++] = arr[right++];
     }
     for(int i=0;i<k;i++){
         arr[low+i]=temp[i];
     }
       }
       public void PrintArray(int []arr){
          for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
          }
       }
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,9};
        int low = 0;
        int high = arr.length-1;
        merginig mq = new merginig();
        mq.mergesort(arr, low, high);
        mq.PrintArray(arr);
       
    }
}
