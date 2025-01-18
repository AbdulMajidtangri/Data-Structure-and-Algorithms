public class classwork {
    int data;
    classwork next;

    classwork(int data) {
        this.data = data;
    }

    classwork(int data, classwork next) {
        this.data = data;
        this.next = next;
    }
    
    public static  classwork insert(int value, classwork start) {
        classwork p = start;
        if (start == null || start.data > value) {
            start = new classwork(value, start);
            return start;
        }
        while (p.next != null) {
            if (p.next.data > value) {
                break;
            }
            p = p.next;
        }
        p.next = new classwork(value, p.next);
        return start;
    }
    public static classwork clone(classwork cs,classwork cs2){
        classwork temp = cs;
        while (temp != null) {   
          cs2 = insert(temp.data,cs2);
             temp = temp.next;

        }
        return cs2;
    }

    public static void main(String[] args) {
        classwork cs = new classwork(2);
        classwork cs2 = new classwork(cs.data);
        for(int i=0;i<5;i++){
         classwork.insert(i+5, cs);
        }
      cs2 = null;
      cs2 =  clone(cs,cs2); 
      classwork t = cs2;
      classwork c = cs;
       System.out.println("The elements in thr cloned list");
      while (t != null) {
        System.out.println(t.data+" ");
        t = t.next;
      }
      System.out.println("The elements in the Actaul list");

      while (c != null) {
        System.out.println(c.data+" ");
        c = c.next;
      }
    }
}
