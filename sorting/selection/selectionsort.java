public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,};
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int t= arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        } 
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
   
}
