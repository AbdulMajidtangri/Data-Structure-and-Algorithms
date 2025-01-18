public class dotherform {
public static int search(int [][]arr,int target){
    int row = arr.length;
    int start,end;
    int col= arr[0].length;
    for(int i=0;i<row;i++){
        if(arr[i][0]<=target && arr[i][col-1]>=target ){
          start = 0;
        end = col-1;   
        while (start<=end) {
            int mid = (start + end)/2;
            if(arr[i][mid]==target){
                return mid;
            }
            else if(arr[i][mid]<target){
   start = mid +1;
            }
            else{
                end = mid -1;
            }
            
        }
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        int target = 6;
       int ans =  search(arr,target);
       System.out.println(ans);
    }
}
