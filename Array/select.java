public class select{
   
    public static void main(String []args){
        int arr[]={10,4,1,3,2,7};
        for(int i=0;i<arr.length-1;i++){
  int index = i;
  for(int j=i+1;j<arr.length;j++){
    if(arr[j]<arr[index]){
        index = j;
    }

  }
  int temp = arr[i];
  arr[i] = arr[index];
   arr[index] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}