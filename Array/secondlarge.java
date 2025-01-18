public class secondlarge{
    public static void main(String []args){
        int[] arr = {1, 2,5, 4,10};
        int large = Integer.MIN_VALUE;
        int secl = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         if(arr[i]>large){
             secl = large;
           large = arr[i];
         }
         else if(arr[i]>secl && arr[i]!=large){
            secl = arr[i];
         } 
        }
        System.out.println(large);
        System.out.println(secl);
    }
}