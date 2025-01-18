import java.util.Scanner;
public class oneton{
    //simple way to print the 1 to number
    public static  void print(int num,int n){
        for(int i=0;i<=n;i++){
      System.out.println(num);
      num++;
        }
    }
    //do it through recursion
    public static  void print2(int num,int n){
      if(num==n){
        System.out.println(num);
        return;
      }
      System.out.println(num);
      print2(num+1, n);
    }
    //do it through recursion second of recursion
    public static  void print3(int num){
      if(num==1){
        System.out.print(num+" ");
        return;
      }
      print3(num-1); 
         System.out.print(num+" ");

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
int num = sc.nextInt();
// print(num,n);
print3(num);
    }
}