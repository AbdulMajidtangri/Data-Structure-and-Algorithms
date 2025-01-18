public class BifurcationOfLinkedList {
    int data;
    BifurcationOfLinkedList next;
    public BifurcationOfLinkedList(int data) {
    this.data=data;
    }
    public BifurcationOfLinkedList(int data,BifurcationOfLinkedList next) {
        this.data=data;
        this.next=next;
    }
    public static BifurcationOfLinkedList insert(int x,BifurcationOfLinkedList start) {
        if(start==null||start.data>x) {
            start=new BifurcationOfLinkedList(x, start);
            return start;
        }
        BifurcationOfLinkedList p = start;
        while (p.next != null) {
            if (p.next.data > x) {
                break;
            }
            p = p.next;
        }
        p.next = new BifurcationOfLinkedList(x, p.next);
        return start;
    }
    public static void printList(BifurcationOfLinkedList myNode) {
        while (myNode != null) {
            System.out.print(myNode.data + " ");
            myNode = myNode.next;
        }
        System.out.println();
    }
    public static int getSize(BifurcationOfLinkedList start) {
        int size=0;
        BifurcationOfLinkedList p=start;
        while(p!=null) {
            size++;
            p=p.next;
        }
        return size;
    }
    public static BifurcationOfLinkedList[] bifurcateList(BifurcationOfLinkedList start) {
        int size=getSize(start);
        int mid=size/2;
        int[] firstHalf=new int[mid];
        int[] secondHalf=new int[size-mid];
        BifurcationOfLinkedList p=start;
        for(int i=0;i<mid;i++) {
            firstHalf[i]=p.data;
            p=p.next;
        }
        for(int i=0;i<size-mid;i++) {
            secondHalf[i]=p.data;
            p=p.next;
        }
        BifurcationOfLinkedList firstList=null;
        BifurcationOfLinkedList secondList=null;
        for(int i=0;i<mid;i++) {
            firstList=insert(firstHalf[i],firstList);
        }
        for(int i=0;i<size-mid;i++) {
            secondList=insert(secondHalf[i],secondList);
        }
        return new BifurcationOfLinkedList[] {firstList, secondList};
    }
        public static void main(String[] args) {
            BifurcationOfLinkedList start=null;
            for(int i=1;i<=30;i++) {
                start=insert(5*i, start);}
                System.out.println("The original list is: ");
                printList(start);
                BifurcationOfLinkedList[] lists = bifurcateList(start);
                System.out.println("First list:");
                BifurcationOfLinkedList.printList(lists[0]);
    
                System.out.println("Second list:");
                BifurcationOfLinkedList.printList(lists[1]);
    
        }
    
    }
    