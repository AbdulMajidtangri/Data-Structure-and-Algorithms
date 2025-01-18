public class newmode {
    int data;
    newmode next;
    public newmode(int data) {
        this.data=data;
    }
    public newmode(int data,newmode next) {
        this.data=data;
        this.next=next;
    }
    static newmode insert(int x,newmode start) {
        //precondition list start is in ascending order and start.data<x
        //post condition //
        if(start==null||start.data>x) {
            start=new newmode(x, start);
            return start;
    }
        newmode p=start;
        while(p.next!=null) {
            if(p.next.data>x) {
                break;
            }
            p=p.next;
    }
        p.next=new newmode(x, p.next);
        return start;
    }
    static void printList(newmode start) {
        newmode val=start;
        int count=0;
        int sum=0;
        int length=0;
        //display list
        System.out.println("The list of elements is: ");
        while(val!=null) {
            System.out.print(val.data+" ");
            val=val.next;
            length++;
        }
        System.out.println();
        val=start;
        //even position elements
        System.out.println("Even positioned elements are: ");
        while(val!=null) {
            if(count%2==0) {
                System.out.print(val.data+" ");
                }
            val=val.next;
            count++;}
        System.out.println();
        val=start;
        //odd position elements
        System.out.println("Odd positioned elements are: ");
        count=0;
        while(val!=null) {
            if(count%2!=0) {
                System.out.print(val.data+" ");
                }
            val=val.next;
            count++;}
        System.out.println();
        val=start;
        //the last element
        System.out.println("The last element is: ");
        while(val.next!=null) {
            val=val.next;
        }
        System.out.print(val.data);
        System.out.println();
        val=start;
        //sum
        System.out.println("The sum of elements is: ");
        while(val!=null) {
            sum+=val.data;
            val=val.next;
        }
        System.out.print(sum);
        System.out.println();
        //average
        double av=(double)sum/length;
        System.out.println("Average of elements is: "+av);
    }
        public static void main(String[] args) {
            newmode myNode=null;
            //insert 15 elements
            for(int i=1;i<=15;i++) {
                myNode=insert(5*i, myNode);
            }
            printList(myNode);
        }
    }
    