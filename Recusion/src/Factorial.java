public class Factorial{
    public static int fact(int n){
        if(n==0) return 1;
        int s = fact(n-1);
        int b = n *s;
     return b;
    //  return n * fact(n-1);
    }  
    public static void main(String[] args) {
    //     int n = 6;
    //     int f = n;
    //     for(int i = n-1;i>0;i--){
    //    f =f*i;
    //     }
        System.out.println("The factorial of the "+fact(5));
    }
}