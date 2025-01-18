import java.util.Scanner;

public class sumOfNNumbers {
    public static int summ(int num){
        if(num==1){
            return 1;
        }
      return  num + summ(num-1);
     }
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int y =  summ(num);


    }
}
