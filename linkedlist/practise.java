class practise {
    int data;
    practise next;

    practise(int data) {
        this.data = data;
    }

    public static practise insert(int value, practise head) {
        practise newNode = new practise(value);
        if (head == null || head.data > value) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        practise temp = head;
        while (temp.next != null) {
            if (temp.next.data > value) {
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static practise delinsert(int value, practise head) {
        if (head == null) {
            return null;
        }
       
        if (value == 0) {
            head = head.next;
            return head;
        } 
        practise temp = head;
        practise prev = null;
        int count = 0;
        while (temp != null) {
            if (count == value) {
                prev.next = prev.next.next;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
public static practise deletelast(int value,practise head){
 practise temp = head;
    while (temp.next.next != null) {
    temp = temp.next;
  }
  temp.next = null;
  return head;
}
    public static void main(String []args){
    practise head = new practise(0);
   
    for(int i=0;i<5;i++){
            insert(i+4, head);
    }
    practise temp = head;
   
   head = delinsert(5,head);
     while (temp != null) {
        System.out.print(temp.data +" ");
        temp = temp.next;
    }
    }
}
