import java.util.Scanner;

public class digit{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(num);
        int sum = 0;
        while (num > 0) {
          int ld = num%10; 
          sum +=ld; 
                  System.out.println("The last digit is "+ld);
                  num = num/10;
        }
        System.out.println("the sum is "+sum);
    }
}