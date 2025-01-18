import java.util.Stack;
public class nextsmaller {
    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();
        int arr[] = {10,2,9,7,6,3,2,1};
        int result[] =  new int[arr.length];
        for(int i=0;i<arr.length;i++){
   result[i] =  -1;
        }
        for(int i=0;i<arr.length;i++){
            if(si.empty()){
                si.push(i);
            }
            else{
                while (!si.empty() && arr[si.peek()]>arr[i]) {
                    result[si.pop()] = arr[i];
                }
                si.push(i);
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
