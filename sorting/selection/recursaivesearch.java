public class recursaivesearch {
    public static int recursaivesearch(int arr[],int target,int low ,int high){
        int mid = low + (high - low)/2;
       if(low>high){
        return -1;
       }
       if(arr[mid]==target)
       return mid;
       else if(arr[mid]<target)
       return recursaivesearch(arr, target, mid +1, high);
       else
       return recursaivesearch(arr, target, low, mid -1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        System.out.println(recursaivesearch(arr, target,0,arr.length-1));
    }
}
