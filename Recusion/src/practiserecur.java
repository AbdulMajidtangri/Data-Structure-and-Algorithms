public class practiserecur {
    public static void printt(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printt(n - 1);
        System.out.print(n + " ");

    }

    public static void printreverse(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printreverse(n - 1);
    }

    public static int power(int n, int p) {
        if (p == 1) {
            return n;
        }
        return n * power(n, p - 1);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int printfibonacci(int n){
    if(n<3){
        return 1;
    }
      return   n*printfibonacci(n-1);
    }

    public static void main(String[] args) {
        // print 1 - n
        int n = 20;
        System.out.println("Printing one to n number");
        practiserecur.printt(n);
        System.out.println();
        // print n - 1
        System.out.println("Printing n to 1");
        practiserecur.printreverse(n);
        System.out.println();
        // SOlving thenumber woth its power
        System.out.println("Solving the number with power :");
        System.out.println(practiserecur.power(2, 4));
        // take outing the factorial OF THE number
        System.out.println("Soliving the factorial of the number");
        System.out.println(practiserecur.factorial(6));
         System.out.println(printfibonacci(20));
    }
}
