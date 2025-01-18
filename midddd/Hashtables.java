import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

class Hash {
    int tablesize = 0;
    LinkedList<Object> list[];
    Hash(int size) {
        list = new LinkedList[size];
        tablesize = size;
        for (int i = 0; i < tablesize; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public int divisionfunction(Object key) {
        int k = key.hashCode();
        return Math.abs(k) % tablesize;
    }
    public int multiplicationfunction(Object key) {
        int k = key.hashCode();
        double goldenratio = 1.618;
        double hashvalue = (Math.abs(k) * goldenratio) % 1;
        return (int) ((int) tablesize * hashvalue);
    }
    public int middsquare(Object key) {
        int squared =key.hashCode();
        squared = squared * squared;
        String sq = ""+squared;
        int si =sq.length() ;
        int half = si / 2;
        String mid = "";
        if (half + 1 == si) {
            mid = sq.substring(half);
        } else {
            mid = sq.substring(half, half + 1);
        }
        int val = Integer.parseInt(mid);
        return val % tablesize;
    }
    public int universal(Object key,int prime) {
        double a = 1 + (Math.random() * (prime - 1));
        double b = (Math.random() * prime);
        int ke = key.hashCode();
        int value = (int) ((a * ke + b) % prime);
        return value % tablesize;
    }
    public void insert(Object key) {
        int index = multiplicationfunction(key);
        list[index].add(key);
    }

    public void delete(Object key) {
        int index = multiplicationfunction(key);
        list[index].remove(key);
    }
    public boolean search(Object key) {
        int index = multiplicationfunction(key);
        return list[index].contains(key);
    }
    public void print() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println("Bucket " + i + " : " + list[i]);
        }
    }
  
}
public class Hashtables {
    
    public static void main(Object[] args) {
        Hash h1 = new Hash(10);
        h1.insert("1111");
        h1.insert("1432");
        h1.insert("1664");
        h1.insert("1885");
        h1.insert("2515");
        h1.insert("3295");
        h1.print();

      
    }
}

