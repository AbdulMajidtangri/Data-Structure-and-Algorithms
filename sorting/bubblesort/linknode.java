public class linknode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    public void insert(int  val){
   Node newnNode = new Node(val);
   if(head== null){
    head= newnNode;
   }
   else{
      Node temp = head;
   while (temp.next != null) {
    temp = temp.next;
   }
   temp.next = newnNode;
   }
    }
    public void print(){
        Node temp= head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void sort(){
        int count = 0;
        Node temp =head;
        while (temp!= null) {
            count++;
            temp = temp.next;
        }
       
        for(int i=0;i<count-1;i++){ temp = head;
            for(int j=0;j<count-i-1;j++){
                if(temp.next != null && temp.data > temp.next.data){
                 int t = temp.data;
                temp.data = temp.next.data;
                temp.next.data = t;     
                }
              temp = temp.next;
            }
            
        }
    }
    public static void main(String[] args) {
        linknode l1 = new linknode();
        l1.insert(4);
        l1.insert(3);
        l1.insert(2);
        l1.insert(1);
        l1.insert(0);
        l1.print();
        l1.sort();
        System.out.println();
        l1.print();
    }
}
