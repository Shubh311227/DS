// we will find largest and smallest number in given 2d array
import java.util.*;
public class Search {
public static void largest(int mat[][]){
    int lar = Integer.MIN_VALUE;
    int n = mat.length;
    int m = mat[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(lar<mat[i][j]){
                lar = mat[i][j];
            }
        }
    }
    System.out.println("The largest number in the matrix is " + lar + "!");
}

public static void smallest(int mat[][]){
    int sm = Integer.MAX_VALUE;
    int n = mat.length;
    int m = mat[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(sm>mat[i][j]){
                sm = mat[i][j];
            }
        }
    }
    System.out.println("The smallest number in the matrix is " + sm + "!");
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

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
    largest(mat);
    smallest(mat);
    sc.close();
}

}