import java.lang.*;
import java.util.Arrays;

public class UniqueValue {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,9, 4, 4, 5, 7, 7 };
        int brr[] = new int[arr.length-2];
        int store = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean chk = true;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    chk = false;
                    break;
                }
            }
            if (chk==true) {
                brr[store] = arr[i];
                store++;
            }
        }   
        System.out.println("Unique values are: ");
      
        for (int r : brr) {
            System.out.print(r+" ");
        }
        System.out.println();
        Arrays.sort(brr);
        for (int i : brr) {
            System.out.print(i+" ");
        }
           int thindlargest = 1;  
              System.out.println();
        for(int i=0;i<brr.length;i++){
          
            if(i==brr.length-thindlargest){
                System.out.println("The second Largest element is "+brr[i]);
            }
        }
        int secondsmallest = 1;  
              System.out.println();   
                     for(int i=0;i<brr.length;i++){
                         
                          if(i==secondsmallest){
                             System.out.println("The second Smallest element is "+brr[i]);
                          }

          

         
        }

    }
}
