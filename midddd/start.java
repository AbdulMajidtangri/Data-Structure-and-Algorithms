public class start {
  public static void main(String[] args) {
    int arr[] = { 10,20,22,33,45,55,90,100 };
    System.out.println("Printing whole array first");
    for(int r : arr) {
System.out.print(r+" ");
          }     
     int largest = Integer.MIN_VALUE;
    int smaleest = Integer.MAX_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    int thirdlargestelemnet = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        secondlargest = largest;
        largest = arr[i];
      }
      if(arr[i]<smaleest){
        smaleest = arr[i];
      }
      if(arr[i]>secondlargest && arr[i]!= largest){
        secondlargest = arr[i];
      }     
    }
    System.out.println();
      System.out.println("The largest elemnet is "+largest);
      System.out.println("The Second Larest  elemnet is "+secondlargest);
      System.out.println("The Smallest elemnet is "+smaleest);
// int temp[] = new int[arr.length];
// int count =0;
// for(int i=0;i<arr.length;i++){
//   boolean flag = true;
//   for(int j=i+1;j<arr.length;j++){
//     if(arr[i]== arr[j]){
//       flag = false;
//       break;
//     }
//   }
//   if(flag){
//     temp[count++]=arr[i];
//   }
// }   
// for(int i=0;i<count;i++){
//   System.out.print(temp[i]+" ");
// }
  }
}