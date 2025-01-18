package paper;

public class quadric {
    int size;
    private Object table[];
    int count =0;
    double loadfactor = 0.7;
quadric(int size){
    this.size = size;
    table = new Object[size];
}
private int hashfunction(Object key){
    return key.hashCode()%size;
}
public void insert(Object key){
    if(count/size>=loadfactor){
        Rehash();
    }
    int index = hashfunction(key);
    int index2 = index;
    int i=0;
    while (table[index] != null) {
 index = (index2+ (++i)*i)%size;
 if(i==size){
    System.out.println("The table is got full ");
 }
    }
    table[index] = key;
    count++;
}
public void delete(int key){
    int index = hashfunction(key);
    int index2 = index;
    int i=0;
    while (table[index] != null) {
        if(table[index].equals(key)){
            table[index]= null;
            count--;
            return;
        }
        index = (index2 + (++i)*i)%size;
        if(i == size){
            System.out.println("the elment does not exist in the given table");
        }
    }

}
public boolean search(int key){
    int index = hashfunction(key);
    int index2 = index;
    int i=0;
    boolean fl = false;
    while (table[index] != null) {
        if(table[index].equals(key)){
            fl = true;
            return fl;
        }
        index = (index2 + (++i)*i)%size;
        if(i == size){
            System.out.println("the elment does not exist in the given table");
        }
    }
    return fl;
}
public void Rehash(){
    Object temp[] = table;
    table = new Object[size*2];
    count = 0;
    for(Object key : temp){
        insert(key);
    }
}
public void print(){
    for(int i=0;i<size;i++){
        System.out.println("Table no : "+i+" "+table[i]);
    }
}
public static void main(String[] args) {
    quadric q1 = new quadric(10);
    q1.insert(12);
    q1.insert(22);
    q1.insert(32);
    q1.insert(42);
    q1.print();

    q1.delete(12);
    q1.delete(22);
System.out.println();
System.out.println();
System.out.println();
    q1.print();
 
}
}