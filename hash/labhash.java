import java.util.LinkedList;

public class labhash {
    private LinkedList<Integer> [] table;
    private int tablesize = 10;
    labhash(){
        table = new LinkedList[tablesize];
        for(int i=0;i<tablesize;i++){
 table[i] = new LinkedList<>();
        }
    }
    private int hashFunction(int key) {
        return key % tablesize;
    }

    public void insert(int key) {
        int hash = midsquare(key);
        System.out.println("in insert: "+hash);
        table[hash].add(key);
    }

    public boolean search(int key) {
        int hash = hashFunction(key);
        return table[hash].contains(key);
    }

    public void delete(int key) {
        int hash = hashFunction(key);
        table[hash].remove(Integer.valueOf(key));
    }
    public int multiple(int key,int a){
    double mult = (key*a*(0.61))%1;
        return (int)(mult *tablesize);
      }
      public int univerfun(int key,int a,int b,int p){
         int index = (((a*key +b )%p)%tablesize);
        return index;
      }
    public void displayTable() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println("Bucket " + i + ": " + table[i]);
        }
    }
public int midsquare(int key){
      String s = key+"";
      System.out.println(s);
      int size = s.length();
      int half = size/2;
      String midval;
      if(half+1 == size){
          midval = s.substring(half);
      } else {
          midval = s.substring(half,half+2);
      }
     int v= Integer.parseInt(midval);
     System.out.println(v);
     int index = v %tablesize;
     System.out.println(index);
     return index;
    }
    public static void main(String[] args) {
        labhash lh = new labhash();
        lh.insert(21);
        lh.insert(4);
        lh.insert(6);
        lh.insert(8);
        lh.insert(9);
       
        // int in = lh.multiple(12, 2);
        // System.out.println(lh.multiple(12,2));
        // lh.insert(in); 
        // lh.displayTable();
        // System.out.println("Thwe universal Hash values "+lh.univerfun(3,2,6,7));
        // int in2 = lh.univerfun(3,2,6,7);
        // lh.insert(in2 );
        // lh.displayTable();
   // int t= lh.midsquare(12345678);
     //  System.out.println(t); 
       lh.insert(12345678);
       lh.displayTable();
        
    }
}