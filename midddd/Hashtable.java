import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

class Hash {
    int tablesize = 0;
    LinkedList<String> list[];
    Hash(int size) {
        list = new LinkedList[size];
        tablesize = size;
        for (int i = 0; i < tablesize; i++) {
            list[i] = new LinkedList<>();
        }
    }
    public int divisionfunction(String key) {
        int k = Integer.parseInt(key);
        return Math.abs(k) % tablesize;
    }
    public int multiplicationfunction(String key) {
        int k = Integer.parseInt(key);
        double goldenratio = 1.618;
        double hashvalue = (Math.abs(k) * goldenratio) % 1;
        return (int) ((int) tablesize * hashvalue);
    }
    public int middsquare(String key) {
        int squared = Integer.parseInt(key);
        squared = squared * squared;
        String sq = String.valueOf(squared);
        int si = sq.length();
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
    public int universal(String key, int prime) {
        double a = 1 + (Math.random() * (prime - 1));
        double b = (Math.random() * prime);
        int ke = Integer.parseInt(key);
        int value = (int) ((a * ke + b) % prime);
        return value % tablesize;
    }
    public void insert(String key, int prime) {
        int index = universal(key, prime);
        list[index].add(key);
    }

    public void delete(String key, int prime) {
        int index = universal(key, prime);
        list[index].remove(key);
    }
    public boolean search(String key, int prime) {
        int index = universal(key, prime);
        return list[index].contains(key);
    }
    public void print() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println("Bucket " + i + " : " + list[i]);
        }
    }
    public void encrypteTheString(String s){
        String encrypted = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            encrypted += (char) (c + 1);

    }
    System.out.println(encrypted);

}
}
public class Hashtable {
    public static void main(String[] args) {
        Hash h1 = new Hash(5);
        int prime = 7;
        h1.insert("1220", prime);
        h1.insert("1432", prime);
        h1.insert("1664", prime);
        h1.insert("1885", prime);
        h1.insert("2515", prime);
        h1.insert("3295", prime);
        h1.print();

        System.out.println();
        h1.encrypteTheString("Majid");
    }
}
