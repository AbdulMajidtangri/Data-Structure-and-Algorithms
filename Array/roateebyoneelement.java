public class roateebyoneelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int  t = arr[0];
        for(int j= 1;j<arr.length;j++){
            arr[j-1] = arr[j];
        }
        arr[arr.length-1] = t;
        for(int u :  arr){
System.out.print(u+" ");
    }
}
}
