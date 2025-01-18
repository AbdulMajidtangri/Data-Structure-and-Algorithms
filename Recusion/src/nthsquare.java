public class nthsquare {
    public static  int  print(int num,int n){
  if(n==1){
    return num;
  }

  return num*print(num,n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int num   =2;
 int y = print(num, n);
 System.out.println(y);

    }
}
