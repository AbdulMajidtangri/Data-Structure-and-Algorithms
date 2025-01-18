public class fibonacciseries {
    public static void fibonacci(int n){
        int arr[] = new int[n];
        arr[0] = 1;
        if(n>1){
            arr[1] = 1;
        }
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
         System.out.print("The last number is :"+arr[n-1]);
    }
    public static int fibonacci2(int n){

      if(n<1) return 0;
if(n<3) return 1;
return fibonacci2(n-1) + fibonacci2(n - 2);
    }
    public static void main(String[] args) {
    //   fibonacci(10);
    // for(int i = 80;i<90;i++){
    //      int s = fibonacci2(i);
    //   System.out.println(s);
    // }
    // int y  = fibonacci2(85);
    // System.out.println(y);
    fibonacci(55);
    }
}
