package practise;
public class start {
    public static void main(String[] args) {
        int arr[] = {98,7,6,54,3,2,2,45,3,1};
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j= i+1;j<arr.length-1;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
