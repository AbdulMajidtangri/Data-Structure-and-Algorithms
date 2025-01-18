public class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
    }
    Node2(int data,Node2 next){
        this.data = data;
        this.next = next;
    }
    public static Node2 insert(int value,Node2 start){
        Node2 p = start;
        if(start == null || start.data > value){
            start = new Node2(value,start);
            return  start;
        }
        while (p.next != null){
            if(p.next.data > value){
                break;
            }
            p = p.next;
        }
        p.next = new Node2(value,p.next);
        return  start;
    }
    public static  void printlist(Node2 start){
        Node2 temp = start;
int sum = 0;
int count=0;
        while (temp.next != null){
            count++;
            if(count%2==0){
                System.out.println("THe Even Number :"+temp.data +" ");
            }
            if(count%3==0){
                System.out.println("THe Odd Number :"+temp.data +" ");
            }

            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("the Last Element is :"+temp.data);
        System.out.println("the total sum is :"+sum);
    }
    public static void main(String[] args) {

Node2 n = new Node2(3);
for(int i=1;i<=15;i++){
    n =Node2.insert(2+i,n);

}
Node2.printlist(n);
    }
}
