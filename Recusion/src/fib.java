public class fib {
    public static  long fibonacci(int  n) {
        if (n <= 1) {
            return n;
            }
            return fibonacci(n-1)+ fibonacci(n-2);
        }

    public static void main(String[] args) {
        int n = 10;
long y = fibonacci(n);
System.out.println(y);
    }
}
