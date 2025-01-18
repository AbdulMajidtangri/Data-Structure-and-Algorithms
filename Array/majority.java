public class majority{
    public static int majority(int []arr){
int count =0;
int val  = 0;
for(int i=0;i<arr.length;i++){
    if(count ==0){
        count=1;
        val=arr[i];
    }
   else  if(arr[i]==val){
        count++;
    }
    else{
        count--;
    }

}
int c = 0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==val){
        c++;
    }
 

}   if(c>(arr.length/2)){
        return val;
    }
return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {6,5,5};
        int w = majority(arr);
        System.out.println(w);
    }
}