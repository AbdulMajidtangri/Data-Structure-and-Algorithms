public class duplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5};
        int j=0;
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j++] = arr[i-1];
                count++;
            }
        }
        System.out.println(count);
        for(int  i=0;i<j;i++){
            System.out.print(arr[i]+" ");
            }

    }
}
