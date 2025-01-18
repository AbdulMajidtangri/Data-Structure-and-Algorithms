public class breaklist {
    int data;
    breaklist next;
    breaklist(int data){
        this.data = data;
    }
    breaklist(int data,breaklist next){
        this.data = data;
        this.next = next;
    }
    public static breaklist insert(int data,breaklist head){
        if(head== null || head.data>data){
  head = new breaklist(data, head);
  return head;
        }
        breaklist temp = head;
        while (temp.next!= null) {
            if(temp.next.data > data){
                break;
            }
            temp = temp.next;
        }
        temp.next = new breaklist(data, temp.next);
        return head;
    }
    public static breaklist[] dividethelist(breaklist head){
        breaklist list1 = null;
        breaklist list2 = null;
breaklist t1 = list1;
 breaklist t2 = list2;
        if(head == null){
            return new breaklist[]{list1,list2};
        }
        
            breaklist temp = head;
            int count  = 0;
            while (temp!= null) {
                count++;
                temp = temp.next;
            }
            int mid = count / 2;
            int cnt = 0;
        for( temp = head;temp!= null;temp = temp.next ){
            cnt++;
            if(cnt>mid){
            list2 = insert(temp.data, list2);
            }
            else{
                list1 = insert(temp.data, list1);
            }
        
        }
        return new breaklist[]{list1,list2};
        }

    public static void main(String[] args) {
        breaklist head = new breaklist(1);
        for(int i=0;i<5;i++){
            insert(i+2,head);
        }
       breaklist temp = head;
       System.out.println("The actual list is ");
       while (temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
       System.out.println();
      breaklist take [] =  dividethelist(head);
      breaklist f = take[0];
      System.out.println("First Sublist is ");
      while (f!=null) {
        System.out.print(f.data+" ");
        f= f.next;
      }
      System.out.println();
      System.out.println("Second sublist  is ");
      breaklist f1 = take[1];
      while (f1!=null) {
        System.out.print(f1.data+" ");
        f1= f1.next;
      }
    }
}
