import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;}}
public class homework{
  
    public static void main(String[] args) {
    System.out.println("Enter the data in the Head");  
          Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
        Node1 head = new Node1(h);
        System.out.println("How many elements You want to add In LinkedList Head is Already there");
        int num = sc.nextInt();
        Node1 temp = head;
        int count=1;
        System.out.println("Enter the data in the nodes");
        for(int i=1;i<=num;i++){ 
        int store = sc.nextInt();
        Node1 newelele = new Node1(store);
        temp.next =newelele;
        temp = newelele;
        count++;
      }
        System.out.println();
        System.out.print(temp.data);
        System.out.println();
        System.out.print("There are the "+count+" elements");
        System.out.println();
        temp = head;
        System.out.print("the EleMents are ");
        while (temp !=null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }



    }
       
}