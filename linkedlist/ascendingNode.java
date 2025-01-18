
public class ascendingNode{
    int data;
    ascendingNode next;
    ascendingNode(int data){
        this.data = data;}

        ascendingNode(int data,ascendingNode next){
            this.data= data;
            this.next = next;
        }
        // inset the lelemenet is acsending ordered
        public static void printList(ascendingNode start){
            while(start!= null){
                System.out.print(start.data + " ");
                start = start.next;
            }
        }
        //insert a new node with value in ascending order
        //return the new head of the list after insertion
        //if the list is empty or the new node should be placed at the beginning, return the new node as the head of the list
        //if the new node should be placed after a node with value less than or equal to the head, return the new node as the head of the list
        //if the new node should be placed between two nodes with values less than or equal to each other, insert the new node between them and return the head of the list
        //if the new node should be placed after all nodes with values less than or equal to each other, append the new node to the end of the list
        //return the head of the modified list after the insertion operation
        //Note: You can assume that the input list is not null and contains at least one node.
        
                //Example:
                //Input: head = [1,2,4,6], value = 3
                //Output: [1,2,3,4,6]
                //Input: head = [-1,5,3,4,0], value = 2
                //Output: [-1,0,2,3,4,5]
                //Input: head = [1], value = 0
                //Output: [0,1]
                //Input: head = [], value = 5
                //Output: [5]

               
        public  static ascendingNode  insert(int value,ascendingNode start){
            ascendingNode p = start;
            ascendingNode newnode = new ascendingNode(value);
            if(start == null || start.data>value){
                newnode.next = start;
                return newnode;
            }
            p = start;
            while (p.next != null) {
                if(p.next.data > value){
                                    break;
                }
                p = p.next;
            }
            // newnode.next = p.next;
            // p.next = newnode;
            p.next = new ascendingNode(value, p.next);
            return start;
                    }
    public static void main(String[] args) {
        ascendingNode  head = new ascendingNode(5);
   head =    ascendingNode.insert(4,head); 
      head =   ascendingNode.insert(2,head);
      head =   ascendingNode.insert(90,head);
// head.printList(head);
    //  head =  ascendingNode.insert(7,head);
      head.printList(head);

      
    }
}