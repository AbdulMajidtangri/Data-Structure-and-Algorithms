class AVLtree {
    int data;
    AVLtree left;
    AVLtree right;
    AVLtree nil = new AVLtree();
    int height;
   private AVLtree() {
        left = right = nil;
    }
    public AVLtree(int data) {
        this.data = data;
        this.left = this.right = nil;
        height += 1;

    }
    AVLtree(int data, AVLtree left, AVLtree right) {
        this.data = data;
        this.left = left;
        this.right = right;
        height =1 + (left.height + right.height);
    }
    public int size(){
        if(this == nil) return 0;
        return 1 + left.size() + right.size();
    }
    public int add(int data){
        int oldsize = size();
        grow(data);
        return  size() - oldsize;

    }
    public AVLtree grow(int data){
        if(this == nil) {
       return  new AVLtree(data);
    }
    if(this.data==data){
        return this;
    }
    if(this.data>data){
        
        left = left.grow(data);
    }
    else{
        right = right.grow(data);
    }
    rebalance();
    return this;

    
}

public class Binary {
    public static void main(String[] args) {
    }
}