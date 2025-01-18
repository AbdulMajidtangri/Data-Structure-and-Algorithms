public class end {
    public static void main(String[] args) {
        // int arr[]= {1,2,0,3,4,0,5,0,0,6};
        // int temp[]  = new int[arr.length];
        // int count = 0;
        // int j=1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != 0 ){
        //         temp[count++] = arr[i];
        //     }
        // }
        // for(int i=0;i<count;i++){
        //     arr[i] = temp[i];
        // }
        // for(int i=count;i<arr.length;i++){
        //     arr[i] = 0;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //optimal way
        
      int arr[]= {1,2,0,3,4,0,5,0,0,6};
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] != 0){
           arr[j++] = arr[i];
        }
      }
      while (j<arr.length) {
        arr[j++] = 0;
      }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}}
