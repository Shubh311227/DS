import java.util.*;
// number of 7's in the array
public class Sum {
  public static int adder(int mat[][]){
    int n = mat.length;
    int m = mat[0].length;
    int c =0;
        for(int j=0;j<m;j++){
            c += mat[1][j];
        }
    return c;
  }  
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat[][] =  {{1,4,9},{11,4,3},{2,2,3} };
    System.out.println(adder(mat));
}
    
}
