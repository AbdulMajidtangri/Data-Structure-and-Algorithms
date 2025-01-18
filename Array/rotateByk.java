public class rotateByk {
    public static void main(String[] args) {
        //Brute Force 
        //rotating the array by the left
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         int k = 3;
//         int []narr = new int[k];
//         int m = k%arr.length;
//         for(int i=0;i<m;i++){
// narr[i] = arr[i];
//         }
//         for(int i=k;i<arr.length;i++){
//             arr[i-k] = arr[i];
//         }
//   int remain = arr.length - k;
//   int j= 0;
//   for(int i=remain;i<arr.length;i++){
//     arr[i] = narr[j++];
//   }
//   for(int h :  arr){
// System.out.print(h+" ");
//     }
    //optimal Solution
//     int[] brr = {1,2,3,4,5,6,7,8,9};
//     int d = 3;
//     int  e = d%brr.length;
//     //first reverse the fist half
//     int i=0;
//     int end=d-1;
//     while (i<end) {
//         int x= brr[i];
//         brr[i] = brr[end];
//         brr[end] = x;
//         i++;
//  end--;
//     }
//     //Reverse Second  Half
//     int i2= d;
//     int end2 = brr.length-1;
//     while (i2<end2) {
//         int x= brr[i2];
//         brr[i2] = brr[end2];
//         brr[end2] = x;
//         i2++;
//         end2--;
//         }
// int initial = 0,high = brr.length-1;
// while (initial < high) {
//     int h= brr[initial];
//     brr[initial] = brr[high];  
//     brr[high] = h;
//     initial++;
//     high--;
// }

//     for(int s=0;s<brr.length;s++){
//           System.out.print(brr[s]+" ");
//     }
  //rotating thev array by right
//   brute Force
    //   rotating the array by the left
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         int k = 3;
//         int []narr = new int[k];
//         int inilasst = arr.length-k;
//         int j=0;
//         // int m = k%arr.length;
//         for(int i=inilasst;i<arr.length;i++){
// narr[j] = arr[i];
// j++;
//         }
//         for(int i=inilasst-1;i>=0;i--){
//             arr[i+k] = arr[i];
//         }
//         for(int i=0;i<k;i++){
//             arr[i] = narr[i];
//         }

//   for(int h :  arr){
// System.out.print(h+" ");
//     } 
int arr[]={1,2,3,4,5,6,7};
int k =3;
int n = arr.length-1;
int ini = n - k;
int end = n-1;
for(int i=0,j = ini;i<j;i++,j--){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
for(int i=ini+1,j = n;i<j;i++,j--){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

for(int i=0,j = n;i<j;i++,j--){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
for(int o:arr){
    System.out.print(o+" ");
}
}
}
