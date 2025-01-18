public class Nodedelete{
    int data;
    Nodedelete next;
    Nodedelete(int data){
        this.data = data;
    }
    public static Nodedelete deletedhead(Nodedelete head){
        Nodedelete temp = head;
        if(head == null){
            return head;
        }
        head = head.next;
        return head;

    }
    public static Nodedelete deletetail(Nodedelete head){
Nodedelete temp = head;
while(temp.next != null){
    if(temp.next.next== null){
        temp.next = null;
        break;
    }
    temp = temp.next;

}
return head;
    }
    public static Nodedelete deleteelemntindx(Nodedelete head,int position){
   if(head == null){
    return head;
   }
   Nodedelete temp = head;
   if(position == 1){
    
    head = head.next;
    temp = null;

    return head;
   }
   int count = 1;
Nodedelete prev = null;
   while (temp.next!=null) {
    count++;
    prev = temp;
    temp =temp.next;
    if(count == position){
        prev.next = prev.next.next;
     break;
    }
       }   
            return head;

    }
    public static void print(Nodedelete head){
        Nodedelete temp = head;
        while(temp!= null){
        System.out.println(temp.data+" "  );
        temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Nodedelete nd = new Nodedelete(10);
        nd.next = new Nodedelete(20);
        nd.next.next = new Nodedelete(30);
        // nd = deletedhead(nd);
        // nd = deletetail(nd);
        print(nd);
        System.out.println();
        deleteelemntindx(nd,);
        print(nd);

    }
}