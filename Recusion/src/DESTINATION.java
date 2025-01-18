import java.util.Scanner;
public class DESTINATION {
    public static void reachhome(int src,int dest){
        System.out.println("Moving to home "+src+"  distination is "+dest);
        if(src == dest){
            System.out.println("Reached Home succesfully");
            return;
        }
        src++;
        reachhome(src, dest);
    } 
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int src = sc.nextInt();
    int destination  = sc.nextInt();
    reachhome(src, destination);

 }   
}
