public class Nodeacsen {
    int data;
    Nodeacsen next;
    Nodeacsen(int data){
        this.data= data;
    }
    public static  Nodeacsen insert(int value,Nodeacsen head){
        Nodeacsen newnode = new Nodeacsen(value);
        if(head == null){
            return head;
        }
        if(head.data > value)
{
    newnode.next = head;
     
        return newnode;
}
Nodeacsen temp =head;
while (temp.next != null) {
    if(temp.next.data > value){
        break;
    }
    temp = temp.next;
}

newnode.next= temp.next;
temp.next = newnode;

return head;      
    }
    public static void printliast(Nodeacsen st){
        Nodeacsen temp = st;
        while (temp!= null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
      Nodeacsen t =  new Nodeacsen(34);
  t = Nodeacsen.insert(90,t);
  t= Nodeacsen.insert(20,t);
 t=  Nodeacsen.insert(10,t);
 Nodeacsen.printliast(t);
    }
}
