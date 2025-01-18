public class merging{
    public static void mergeSort(int arr[],int low,int high){
        int mid = (low + high)/2;
         if(low>= high) return ;
         mergeSort(arr, low, mid);
         mergeSort(arr, mid+1, high);
         merge(arr, low,mid, high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid +1;
       int []temp = new int[high - low +1]; 
       
        int k=0;
        while (left  <= mid  && right <= high) {
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];

            }
            else{
                temp[k++]=arr[right++];
            } 
        }
        while(left <=mid){
            temp[k++]=arr[left++];

        }
        while(right <=high){
            temp[k++]=arr[right++];

        }
        for(int i=0;i<k;i++){
            arr[low + i] = temp[i];
        }    
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,6,5,6,7,9,8};
        int low = 0;
        int high = arr.length-1;
        System.out.println("The original Array is ");
        printArray(arr);
        System.out.println("After the mergeing  the array is ");
        mergeSort(arr,low,high);
        printArray(arr);
    }
}