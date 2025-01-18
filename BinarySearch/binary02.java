public class binary02{
    public static int search1d(int arr[],int head,int tail,int target){
   while (head<=tail) {
    int mid = head +(tail - head)/2;
    if(arr[mid]==target){
        return mid;

    }
    else if(arr[mid]<target){
        head = mid +1;
    }
    else{
        tail = mid -1;
    }
   }
   return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int head =0;
        int tail = arr.length-1;
        int target = 2;
        long start = System.nanoTime();
      int ans =   search1d(arr,head,tail,target);
      long end= System.nanoTime();
System.out.println(ans);
System.out.println("the time has taken :"+(end - start));
    }
}