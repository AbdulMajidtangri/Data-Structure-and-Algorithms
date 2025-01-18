import java.util.Stack;
public class MakebeautifulArray {
public static void main(String[] args) {
    int arr[] = {1,3,-3,-5,-5,6,7,8,90,-2};
 Stack<Integer> s = new Stack<>();
 for(int i=0;i<arr.length;i++){
    if(s.isEmpty()){
        s.push(arr[i]);
    }
    else if(arr[i]>=0){
        if(s.peek()>=0){
            s.push(arr[i]);
        }
        else{
           s.pop(); 
        }
        
    }
    else{
        if(arr[i]<0){
            if(s.peek()<0){
                s.push(arr[i]);
            }
            else{
                s.pop();
            }
        }
    }
 }
 System.out.println(s);
}
     
}