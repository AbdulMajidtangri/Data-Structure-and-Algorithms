public class Nodee {
    int data;
    Nodee next;
    Nodee(int data){
        this.data = data;
    }
    
    public static void main(String []args){
     Nodee n1 = new Nodee(23);
     Nodee n2 = new Nodee(45);
     Nodee n3 = new Nodee(67);
     n1.next = n2;
     n2.next = n3;
     System.out.println(n1.data);
     System.out.println(n1.next.data);
     System.out.println(n1.next.next.data);
     System.out.println(n2.next.data);

    }
}
