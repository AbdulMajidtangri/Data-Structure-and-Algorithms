class linknode{
    static class Node{
        Integer key;
        Node next;
        Node(int key){
            this.key = key;
            this.next = null;
        }
    }
    Node []arr;
    int size;
    linknode(int size){
        arr = new Node[size];
        this.size = size;
    }
    public void insert(int key){
 Node newnode = new Node(key);
 int index = hashfunction(key);
 newnode.next = arr[index];
 arr[index] = newnode;
    }
    private int hashfunction(int key){
        return key%size;
    }
    public void search(int key){
boolean found = false;
    int index = hashfunction(key);
      Node cur = arr[index];

      while(cur!= null){
        if(cur.key.equals(key)){
            found = true;
            System.out.println("FOund");
        }
        cur = cur.next;
      }
      if(!found){
        System.out.println("NOt fOund ");
      }
    }
public void printilist(){
    for(int i=0;i<arr.length;i++){
        Node c = arr[i];
        while (c!= null) {
            System.out.print("Index " + i + ": ");
            while (c != null) {
                System.out.print(c.key + " ");
                c = c.next;
            }
            System.out.println();
        }
    }
}
}
public class Chainning {
    public static void main(String[] args) {
        linknode lk = new linknode(10);
        lk.insert(1);
        lk.insert(22);
        lk.insert(33);
        lk.insert(44);
        lk.insert(44);
        lk.insert(54);
        lk.insert(64);
        lk.printilist();
    }
}
