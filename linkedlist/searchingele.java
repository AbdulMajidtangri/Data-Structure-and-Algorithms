public class searchingele {
    int data;
    searchingele next;
    searchingele(int data){
        this.data=  data;

    }
    searchingele(int data,searchingele next){
this.data = data;
this.next= next;
    }
    public static searchingele insert(int value,searchingele start){
        if(start == null || start.data >value){
          start = new searchingele(value,start);
  return start;
        }
        searchingele temp = start;
        while (temp.next != null) {
            if(temp.next.data > value){
                break;
            }
            temp = temp.next;
        }
        temp.next = new searchingele(value,temp.next);
        return start;
        
    }
    public static void  searchelemenet(searchingele hed,int target){
        searchingele temp = hed;
        boolean flag = false;
        while (temp!= null) {
           if(temp.data==target){
            flag = true;
           } 
           temp = temp.next;
        }
        System.out.println(flag);
    }

    public static void main(String[] args) {
        searchingele se = new searchingele(2);
         se = insert(22, se);
         se = insert(25, se);
         se = insert(12, se);
         se = insert(8, se);



        int target =56;
        // searchelemenet(se,target);
        //  while (se != null) { 
        //                System.out.println(se.data);
        //     se = se.next;
            
        //  }
    }
}
