import java.util.*;
// number of 7's in the array
public class Count {
  public static int counter(int mat[][], int key){
    int n = mat.length;
    int m = mat[0].length;
    int c =0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j] == key){
                c++;
            }
        }
    }
    return c;
  }  
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat[][] = {{4,7,8},{8,8,7}};
    int key = 7;
    System.out.println(counter(mat,7));
}
    
}
