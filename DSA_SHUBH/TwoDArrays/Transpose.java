import java.util.*;
public class Transpose {
    public static void transposer(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int tmat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            tmat[i][j] = mat[j][i];
            }
        }
        System.out.println("Transpose array:-");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            System.out.print(tmat[i][j] + " ");
            }
        System.out.println();
        }
    }    
        
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows and columns: ");
    int n = sc.nextInt(), m = sc.nextInt();
    int mat[][] = new int[n][m];
    System.out.println("Enter elements of array:- ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            mat[i][j] = sc.nextInt();
        }
    }
    System.out.println("Original Array:");

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
    transposer(mat);
    sc.close();
   } 
}
