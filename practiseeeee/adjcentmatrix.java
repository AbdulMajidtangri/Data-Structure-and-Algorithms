
class adjointmatrix{
    int size;
    int []vertices;
    int [][]adjointmatrix;
    adjointmatrix(int arr[]){
        this.size = arr.length;
        adjointmatrix = new int[size][size];
        vertices = new int[size];
        for(int i=0;i<size;i++){
            vertices[i] = arr[i];
        }
    }
    public void addedges(int v1,int v2,int weight){
        int i = check(v1);
        int j = check(v2);
        if(i ==-1 || j==-1){
System.out.println("Invaled Vertex");
    }
    else{
        adjointmatrix[i][j] = weight;
        adjointmatrix[j][i] = weight;
    }
}
public int check(int v){
    for(int i=0;i<size;i++){
        if(vertices[i]==v){
            return i;
            }

            }
            return -1;

    }
public void printlist(){
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            System.out.print(adjointmatrix[i][j]+" ");
        }
        System.out.println();
    }
}
}
public class adjcentmatrix{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        adjointmatrix a1 = new adjointmatrix(arr);
        a1.addedges(1, 2, 20);
        a1.addedges(1, 3, 40);
        a1.addedges(2, 3, 60);
        a1.addedges(3, 4, 60);
        a1.printlist();
    }
}