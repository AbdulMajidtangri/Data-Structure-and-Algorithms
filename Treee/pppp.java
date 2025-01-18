class binn{
binn left,right;
int data;
public binn(int data){
    this.data=data;
    this.left = null;
    this.right = null;
}
public void add(int a){

    
        if(a> data){

            if(this.right == null){
              right = new binn(a);
            }
            else{
                right.add(a);
            }
        }
        else{
            if(this.left == null){
                left =new binn(a);

            }
            else{
                          left.add(a);
  
            }
        }

}
public String toString(){
    String lefts = (left != null) ?left.toString() : null;
    String rights = (right !=null) ? right.toString() : null;
    return lefts + " " + data + " " + rights ;
}

}
public class pppp {
    public static void main(String[] args) {
        binn b = new binn(3);
        b.add(4);
        b.add(2);
        System.out.println(b.toString());
    }
}
