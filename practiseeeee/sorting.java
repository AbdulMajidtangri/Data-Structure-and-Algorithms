public class sorting{
    public static void main(String[] args) {
        int []brr = {8,5,1,2,6,3,5};
      for(int i=0;i<brr.length;i++){
        for(int j=i;j>0;j--){
            if(brr[j]<brr[j-1]){
int r = brr[j];
brr[j] = brr[j-1];
brr[j-1]= r;
            }
        }
      }
        
        for(int u : brr){
            System.out.print(u);
        }
        System.out.println();

      
        int []arr = {8,5,1,2,6,3,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for( int i : arr){
            System.out.print(i);
        }
    }
}