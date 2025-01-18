public class sorting {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 1, 9 };
    //     int i=0;
    //      buuble sort
    //     while(i<arr.length-1){
    //    int j=0;
    //     while (j<arr.length-i-1) {
    //     if(arr[j]>arr[j+1]){
    //     int t = arr[j];
    //     arr[j] =arr[j+1];
    //     arr[j+1] = t;
    //     }
    //     j++;
    //     }
    //     i++;
    //     }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int t = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = t;
        //         }

        //     }
        // }
        //selectrion sort
        // for (int i = 0; i < arr.length-1; i++) {
        //     int index = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if(arr[index]<arr[j]){
        //             index = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[index];
        //     arr[index] = temp;
        // }
//insertion sort
     for(int i=0;i<arr.length;i++){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

            }
        }
     }
        for (int h : arr) {
            System.out.print(h + " ");
        }
    }
}  
