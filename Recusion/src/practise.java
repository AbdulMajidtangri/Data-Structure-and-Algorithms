public class practise {
    public static void printn(int n, int num){
        if(num == n){
           System.out.print(num+" "); return ; 
        } 
        System.out.print(num+" ");
     printn(n, num+1);
    }
    public static void printn2(int num){
 if(num <=1) 
 {System.out.print(num+" "); return;}
 
printn2(num-1);
  System.out.print(num+" ");
    }
    public static int sum(int num){
        if(num<=1) return num;
        return num + sum(num - 1);
    }
    public static void printarray(int []arr, int n,int i){
      if(i==n){
         System.out.print(arr[i]+" ");
return;                  
      }
      System.out.print(arr[i]+" ");
 printarray(arr,n,i+1);
    }
    public static void printarray2(int []arr,int i){
      if(i==0){
         System.out.print(arr[i]+" ");
return;                  
      }
 printarray2(arr,i+1);  
     System.out.print(arr[i]+" ");

    }
   public static void main(String  []args){
       int n  = 6;
       int num =6;
    //    printn2(num);
    //    printn(n, num);
   //  int sum = sum(num);
   //  System.out.println(sum);
   int arr[] ={1,2,3,4,5,6,7};
   int m= arr.length-1;
   int  i=0;
   // printarray(arr,m,i);
   printarray2(arr,i);
   } 
}
