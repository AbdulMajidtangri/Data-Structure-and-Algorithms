public class intersectionOfsort {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,3, 3, 4, 5,6};
        int brr[] ={2,3,4,5,6,7};
        int temp[] = new int[arr.length+brr.length];
        int count =0;
        for(int i=0;i<arr.length;i++){
            boolean f  = true;
            for(int j=0;j<count;j++){
                   if(arr[i]==temp[j]){
                    f = false;
                    break;
                   }
            }
            if(f){
                for(int j=0;j<brr.length;j++){
                    if(arr[i]==brr[j]){
                        temp[count++]=arr[i];
                        break;
                }
            }
        }
    }
        for(int j=0;j<count;j++){
            System.out.print(temp[j]+" ");
    
    }
}
}
