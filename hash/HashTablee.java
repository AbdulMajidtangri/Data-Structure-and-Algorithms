import java.util.LinkedList;
class Hash {
    int tablesize;
    LinkedList<Integer>  arr[];
    int size;

    Hash(int size) {
        tablesize  = size;
arr = new LinkedList[tablesize];
for(int i=0;i<tablesize;i++){
    arr[i] = new LinkedList<>();
}
    }

    public void insert(int key) {
        int index = hashFunction(key);
        arr[index].add(index); 
    }

    private int hashFunction(int key) {
        return key % size; 
    }
    private  int hashFunction2(int key) {
        int a = (int)(Math.random()*5)+1;
        double fra = (key*a)%1;
return (int)(size*fra);
    }
    public void delete(int key) {
        int index = hashFunction(key);
        arr[index].remove();
        if (arr[index] != null && arr[index].equals(key)) {
            arr[index] = null; 
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {

                System.out.print("Bucket :"+i+" : ");
                if(arr[i]!= null){
                    System.out.println(arr[i]);
                }else{
                    System.out.println("[]");
                }
            
        }
    }
    public void search(int  key) {
        int index = hashFunction(key);
        if(arr[index]==key){
            System.out.println("Found"+arr[index]);
        }
        else{
            System.out.println("Not Found");

        }
    }
    public void Retriv(int key){
        int index = hashFunction(key);
        
    }

}
public class HashTablee{
    public static void main(String[] args) {
        Hash h = new Hash(10);
        h.insert(10);
        h.insert(12);
        h.insert(22);
        h.insert(13);
        h.print(); 
        // h.search(2);
    }
}
