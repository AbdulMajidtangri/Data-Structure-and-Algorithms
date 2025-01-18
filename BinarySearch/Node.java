public class Node {
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
    public static Node insert(int val,Node head){
        if(head== null || head.data>val){
            head = new Node(val, head);
            return head;
        }
        Node temp = head;
        while(temp.next!= null){
            if(temp.next.data>val){
                break;
            }
            temp =temp.next;
        }
        temp.next = new Node(val, temp.next);
        return head;
    }
    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while (temp!= null) {
            Node next  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            }
            return prev;
    }
    public static Node[] split(Node head){
   Node list1 = null;
   Node   list2 = null;
   int count = 0;
   Node temp = head;
   while (temp != null) {
    count++;
    temp = temp.next;
   }
   int mid = count/2;
   temp = head;
   int c = 0;
   while (temp != null) {
    c++;
    if(c>mid){
        list2 = insert(temp.data, list2);
    }
    else{
        list1 = insert(temp.data, list1);
    }
    temp = temp.next;

   }
   return new Node[]{list1,list2};
    }
    public static Node  merge(Node head1,Node head2){
        Node headd = head1;
        while(headd.next != null){
            headd = headd.next;
        }
        headd.next = head2;
        return head1;
    }
    public static void main(String[] args) {
        Node head = new Node(200);
        head = insert(2, head);
        head= insert(30, head);
        head = insert(50, head);
        head = reverse(head);
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        Node tem[] = split(head);
        Node l1 = tem[0];
        Node l2 = tem[1];
        Node l1t = l1;
        Node l2t = l2;
        System.out.println();
        System.out.println("List 1");
        while (l1t!= null) {
            System.out.print(l1t.data+" ");
            l1t = l1t.next;
        }
        System.out.println();
        System.out.println("List2");
        while (l2t!= null) {
            System.out.print(l2t.data+" ");
            l2t = l2t.next;
        }
        System.out.println("Both Lists are Merged");
        Node mergedList = merge(l1, l2);
        while (mergedList!=  null) {
   System.out.print(mergedList.data+" ");
   mergedList = mergedList.next;    
        }
    }
}
