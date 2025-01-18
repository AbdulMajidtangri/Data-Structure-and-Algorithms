public class FibonacciWithoutRecurrsion {

	public static long fab2(int n) {
      int arr[] = new int[n];
      arr[0] = 1;
      if(n>1){
         arr[1] = 1;
      }
      for(int i=2;i<arr.length;i++){
        arr[i] = arr[i-1]+arr[i-2];
    }
    for(int i=0;i<n-1;i++){
        if(arr[i]+arr[i+1]==n){
            return n;
        }
    }
        return -1;
}

	public static void main(String[] args) {

        for(int i=1;i<10;i++) {
            long t1=System.nanoTime();
            long m=fab2(i);
            long t2=System.nanoTime();
            System.out.println("Fabonacci of :"+i+" is "+m+" Time :"+(t2-t1));
        }
	}
}
