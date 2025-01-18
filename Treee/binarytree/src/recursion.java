public class recursion {
    public static  int factorial(int n){
        if(n<2)return 1;
        return n*factorial(n-1);
    }
public static int  fibonacci(int n){
    if(n<1) return 0;
    if(n<3) return 1;

    return fibonacci(n-1)+fibonacci(n-2);
}
public static int power(int n,int p){
    if(p<0) return 1;
    return n*power(n, p-1);
}
public static void  print(int n){
if(n<=0) {System.out.print(n+" "); return;}
System.out.print(n+" ");
 print(n-1);
}
public static  void fib(int r){
    int arr[] = new int[r+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2;i<=r;i++){
        arr[i] = arr[i-1]+arr[i-2];
    }
    for(int i=0;i<=r;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
       int a = 2;
//        System.out.println(factorial(a));
// System.out.println(fibonacci(30));
// System.out.println(power(a, 3));
// print(6);
fib(8);
    }
}
