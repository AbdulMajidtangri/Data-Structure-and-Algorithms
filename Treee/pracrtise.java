package TREEE;
import java.util.Scanner;
class beet{
    int data;
    beet left;
    beet right;
    beet(int data){
        this.data = data;
        this.left = this.right = null;
    }
    public void insert(int key){
        if(key > data){
            if(right==null){
                            this.right= new beet(key);
            }
            else{
                right.insert(key);}
            }
            else{
                if(left==null){
                    this.left= new beet(key);
            }
            else{
                left.insert(key);
      }
    }
}}
public static  beet insertIntoBST(beet root,int data){
    if(root == null){
        root = new beet(data);
    }
    if(data > root.data){
        //right part ma insert kerna
        root.right = insertIntoBST(root.right, data);
    }
    else{
        //left part ma insert kerna
        root.left = insertIntoBST(root.left, data);
    }
}
public static void takeInput(beet root){
    Scanner sc = new Scanner(System.in);
        int data;
        while (data != -1) {
            insertIntoBST(root,data);
           data =  sc.nextInt();
        }

}
public class pracrtise {
    public static void main(String[] args) {
        //insertion and deletion in binary search tree
beet root = null;
System.out.println("Inout the dT to create tjhe beet");
takeInput(root);
    }
}
