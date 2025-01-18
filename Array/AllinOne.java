public class AllinOne{

    public static int binarysearch(int [][]arr,int target){
      int row =arr.length;
      int col = arr[0].length;
      for(int i=0;i<row;i++){
        if(arr[i][0] <= target && arr[i][col-1]>=target){
            int low = 0;
            int high =col-1;
            while (low <= high) {
                int mid =( high + low)/2;
                if(arr[i][mid]==target){
                    return mid;
                }
                else if(arr[i][mid]<target){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        
      }return -1;
    }
    public static int binarysearch2(int [][]arr,int target){
        int r = arr.length;
        int c= arr[0].length;
        int low= 0;
        int high= r*c-1;
        while (low<=high) {
            int mid = (high- low)/2;
            int row = mid*r;
            int col = mid%c;
            if(arr[row][col]== target){
                return col;
            }
            if(arr[row][col]<target){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,4,6},{8,10,12}};
   int target = 12;
//    int y= AllinOne.binarysearch(arr, target);\
int y= AllinOne.binarysearch2(arr,target);
   System.out.println(y);
    }
}
