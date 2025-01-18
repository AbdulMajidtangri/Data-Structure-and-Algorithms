package labtree;
import java.lang.*;
class tree{
    int data;
    tree left;
    tree right;
    tree(int data){
        this.data = data ;
        this.left = right = null;
    }
    tree(int data,tree left,tree right){
this.data = data;
this.left = left;
this.right = right;
    }
    public  void prinbtntree(tree r){
      if(r != null){
        return;
      }
        if(r.left!= null){
  System.out.println(r.left.data);
           

        }
        if(r.right != null){
            System.out.println(r.right.data);

        }
 left.prinbtntree(r.left);
              right.prinbtntree(r.right);
  }
}
public class tree01 {
    public static void main(String[] args) {
          tree child1 = new tree(23);
          tree child2 = new tree(45);
          tree root = new tree(10,child1,child2);
      root.prinbtntree(root);
    }
}
