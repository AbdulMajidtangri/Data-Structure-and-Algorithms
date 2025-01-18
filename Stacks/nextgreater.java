import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        int arr[] = {8, 4, 7, 9, 5, 3};
        int result[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }

      
        for (int i = arr.length-1; i >= 0; i--) { 
             if(s.isEmpty()){
s.push(i);
        }
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                result[s.pop()] = arr[i]; 
            }
            s.push(i); 
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
