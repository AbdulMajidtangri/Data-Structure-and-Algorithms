
class linearprobing{
    int []hashtable;
    int size;
    int count=0;
    double loadfactor=0.7;
linearprobing(int size){
this.size = size;
this.hashtable = new int[size];
}
public int hashfunction(int key){
    return key%size;
}
public void insert(int key){
    if(count/size >= loadfactor){
        Rehash();
    }
int index = hashfunction(key);
int index2 = index;
int i=0;
while (hashtable[index] != 0 && hashtable[index] != -1) {
    index = (index2 + ++i)%size;
    if(i==size){
        System.out.println("Hash table is full");
    }
}
hashtable[index] = key;
count++;
}
public void remove(int key){
int index = hashfunction(key);
int index2 = index;
int i=0;
while (hashtable[index]!= -1) {
    index = (index2 + ++i)%size;
    if(hashtable[index]==key){
        hashtable[index] = -1;
        count--;
    }
    if(i == size){
        System.out.println("Key not found");

    }
}
}
public void Rehassh(){
    size = size*2;
    int[] temp = new int[size];
    temp =hashtable;
    for(int k : hashtable){
        if(k != -1){
            insert(k);
    }

}
}
}
public void print(){
    for(int i=0;i<size;i++){
        System.out.print(hashtable[i]+" ");
        }
        System.out.println();

}
}
public class Collision {
    public static void main(String[] args) {
        linearprobing lp = new linearprobing(10);
       for(int i=1;i<4;i++){
lp.insert(i*2);
       }
       lp.remove(4);
       lp.print();
    }
}
