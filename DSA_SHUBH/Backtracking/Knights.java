import java.util.*;
public class Knights{
static int N = 8;
public static boolean isSafe(int x, int y, int sol[][]){
    return(x>=0 && x<N && y>=0 && y<N && sol[x][y] == -1);
}
public static void printSol(int sol[][]){
    for(int i = 0; i<N; i++){
        for(int j = 0; j<N ; j++){
            System.out.print(sol[i][j] + " ");
        }
        System.out.println();
    }

}
public static boolean solveKT(){
    int sol[][] = new int[8][8];
    for(int i = 0; i<N; i++){
    for(int j = 0; j< N; j++){
        sol[i][j] = -1;
    }
}
    int xMove[] = {2,1,-1,-2,-2,-1,1,2};
    int yMove[] = {1,2,2,1,-1,-2,-2,-1};
    sol[0][0] = 0;


    if(!solveKTUtil(0,0,1,sol,xMove,yMove)){
        System.out.println("Solution does not exist");
        return false;
    }
    else{
        printSol(sol);
        return true;
    }
}
public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]){
    int k, nextx, nexty;
    if(movei == N*N){
        return true;
    }
    for( k = 0; k< 8; k++){
        nextx = x+ xMove[k];
        nexty = y+ yMove[k];
        if(isSafe(nextx,nexty,sol)){
        sol[nextx][nexty] = movei;
        if(solveKTUtil(nextx, nexty, movei+1, sol, xMove, yMove)){
            return true;
        }
        else{
            sol[nextx][nexty] = -1; // backtracking
        }
    }

    }
    
    return false;
}
public static void main(String args[]){
    solveKT();
}
}