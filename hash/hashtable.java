import java.util.LinkedList;

public class hashtable {
    int tablesize = 10;
    private LinkedList<Integer>[] table;

    public hashtable() {
        table = new LinkedList[tablesize];
        for (int i = 0; i < tablesize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public int hashfunction(int key) {//division
        return key % tablesize;
    }
    public int hashfunction2(int key){//multiplication
     double random= 0.6180339887;
        double fractpart = (key*random)%1;
        return  (int)(fractpart*tablesize);
    } 
    public int hashfunction3(int key,int prime){//universal
        int a= 1 + (int)( Math.random() * (prime - 1));
        int b= (int)(Math.random()*prime);
        int fractpart = (a*key+b)%prime;
        return  (fractpart%tablesize);
    }
    public int hashfunction4(int key){//midsquare 
        String str = key+"";
        int size = str.length();
        int half = size/2;
        String mid;
        if(half+1== size){//for 1,2,3
            mid = str.substring(half);
        }
        else{
            mid = str.substring(half, half+2);
        }
        int hashcode = Integer.parseInt(mid);
        return hashcode%tablesize;
      
      }
    public void add(int key) {
        int hash = hashfunction4(key); 
        table[hash].add(key);
    }

    public void delete(int key) {
        int hash = hashfunction2(key);
        table[hash].remove(Integer.valueOf(key));
    }

    public boolean search(int key) {
        int hash = hashfunction2(key); 
        return table[hash].contains(key);
    }

    public void display() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println("Bucket " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
        hashtable table1 = new hashtable();
        table1.add(34);
        table1.add(44);
        table1.add(54);
        table1.add(56);
        table1.add(89);
        table1.add(78);
        table1.add(67);
        table1.add(93);
        table1.display();
    }
}
