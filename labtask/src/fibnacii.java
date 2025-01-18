public class fibnacii{
    public  static long fibonacci(int n){
        if(n<1){
            return 0;
        }
        if(n<3){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public  static long fibonacci2(int n2){
 int arr[] = new int[n2];
 arr[0] = 1;
 if(n2>1){
    arr[1] = 1;
 }
 for(int i=2;i<arr.length;i++){
    arr[i] = arr[i-1] + arr[i-2];
 }
 for(int i=0;i<n2-1;i++){
    if(arr[i]+arr[i+1]==n2)
return n2;
 }
 return -1;
    }
    
    
    public static void main(String []args){
long s = System.currentTimeMillis();
Long h = fibnacii.fibonacci(3);
long en = System.currentTimeMillis();
 System.out.println("The fibonacci number is "+h);
 System.out.println(en - s);

long y = fibnacii.fibonacci2(5);
 System.out.println("the fibnacee number is : "+y);
    }
}