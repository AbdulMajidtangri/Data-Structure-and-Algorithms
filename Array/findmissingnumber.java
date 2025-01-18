public class findmissingnumber{
    public static void main(String []args){
        //brute force 
//         int arr[] = {1,2,3,4};
//         int n = 5;
//         for(int i=1;i<=n;i++){
//  boolean flag = false;
//  for(int k = 0;k<arr.length;k++){
//     if(arr[k]==i){
//      flag = true;
//      break;
//     }

//  }
//  if(!flag){
//     System.out.println(i+" Not exsist in the array ");
//  }

//         } 
int arr[] = {1,2,3,4};
int n = 5;
int sum1 = 0;
for(int i=1;i<=n;i++){
sum1 +=i;

}
int sum2 = 0;

for(int i=0;i<arr.length;i++){
    sum2 +=arr[i];
}
if((sum1 - sum2)==0){
    System.out.println("NO any numbet idsd missing in thr array  " );
}
else{
    System.out.println("The missing number is "+(sum1 - sum2));
}

    }
}