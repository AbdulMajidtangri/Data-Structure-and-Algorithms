public class checksortedarray{
    public static void main(String []args){        
        int[] arr = {1, 2, 3, 5,67,1};
        boolean flag = true;
   for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
        flag = false;
        break;
   }
   }
   System.out.println(flag);
    }
}