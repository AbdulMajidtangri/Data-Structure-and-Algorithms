public class largelist {
    int data;
    largelist next;

    largelist(int data) {
        this.data = data;
    }

    largelist(int data, largelist next) {
        this.data = data;
        this.next = next;
    }

    public static largelist insert(int value, largelist head) {
        largelist l = head;
        if (head == null || head.data > value) {
            head = new largelist(value, head);
            return head;
        }
         l = head;
        while (l.next != null) {
            if (l.next.data > value) {
                break;
            }
            l = l.next;
        }
        l.next = new largelist(value, l.next);
        return head;
    }
public static void printlist(largelist head){
       largelist temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
temp = temp.next;
        }
}
public static largelist[] half(largelist head){
int count =0;
largelist temp = head;
largelist list1 = null;
largelist list2 = null;

while (temp !=null) {
    count++;
    temp = temp.next;
}
int middle = count/2;
int c = 0;
temp = head;
while (temp != null) {
    c++;
list1  = insert(temp.data,list1);
    if(c==middle){
       break;  
    }
    temp = temp.next;
}

c=0;
temp = head;

while (temp != null) {
    c++;
    if(c>middle){
      list2 = insert(temp.data,list2);
    }
    temp = temp.next;
}
// return list2;
return new largelist[]{list1,list2};
}
public static void printlist1(largelist list1){
    largelist temp = list1;
     while (temp != null) {
         System.out.print(temp.data + " ");
temp = temp.next;
     }
}
public static void printlist2(largelist list2){
    largelist temp = list2;
     while (temp != null) {
         System.out.print(temp.data + " ");
temp = temp.next;
     }
}
    public static void main(String[] args) {
        largelist l1 = new largelist(0);
        for (int i = 20; i >=1; i--) {
            insert(i , l1);
        } 
        largelist lists[] = half(l1);
        largelist list1 = lists[0];
        largelist list2 = lists[1]; 
          printlist(l1);
          System.out.println();
          System.out.println("First list is");
          printlist1(list1);
          System.out.println();
          System.out.println("Second list is :");
          printlist2(list2);
    //       largelist l2 = new largelist(0);
    // largelist l3 = new largelist(0);  
    // l2 = half(l1);
    //  l3 = half(l1);
    // System.out.println("The acutal Liat");
  
     
    //  System.out.println(); System.out.println("first list");
    //  printlist1(l2);
    //  System.out.println();  
    //     // System.out.println("Second lIst");
    // //  printlist2(l3);
    
    }
}