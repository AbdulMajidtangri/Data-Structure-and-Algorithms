public class voting0{
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,3,3,4,5,3,3};
        int count =0;int ele = arr[0];
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count =1;
                ele = arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
    int count1 = 0;
    for(int i =0;i<arr.length;i++){
        if(arr[i]==ele){
            count1++;
        }
        if(count1 > arr.length/2){
            System.out.println(ele);
            break;
        }
      
    }
    }
}