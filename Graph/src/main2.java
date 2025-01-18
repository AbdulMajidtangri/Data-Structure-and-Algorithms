class adj{
    int size;
    String []veritices;
    boolean [][]ver;
    adj(String []arr){
        size = arr.length;
ver = new boolean[size][size];
        System.arraycopy(arr,0,veritices,0,arr.length);
    }
    public void add(String v,String v2){
        int u = index(v);
        int u2=  index(v2);
        ver[u][u2] = true;
    }
    private int index(String  v){
        for(int i=0;i<size;i++){
            if(veritices[i].equals(v)){
                return i;
        }
    }
        return -1;
}
    public  void print(){
for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
System.out.print((ver[i][j] ? "1" : "0")+" ");
    }
    System.out.println();
}
    }


}
public class main2 {
    public static void main(String[] args) {
        String a[] = {"a","b","c","d"};
        adj a1= new adj(a);
        a1.add("a", "b");
        a1.add("a", "c");
        a1.add("b", "c");
        a1.add("b", "d");
        a1.add("d", "c");
        a1.add("d", "b");
        a1.print();



    }
}
