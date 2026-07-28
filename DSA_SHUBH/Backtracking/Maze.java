
import java.util.*;
public class Maze{
    public static void printSol(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(" " + sol[i][j] + "");
            
            }
            System.out.println();
        }
        System.out.println();
        
    }
    public static boolean isSafe(int maze[][], int x, int y){
        return(x>=0 && x<=maze.length-1 && y>=0 && y<=maze.length-1 && maze[x][y]==1);

    }
    public static boolean solveMaze(int maze[][], int x, int y){
        int n = maze.length;
        int sol[][] = new int[n][n];
        if(solveMazeUtil(maze,x,y,sol) == false){
            System.out.println("Solution does not exist");
        return false;
        }
            return true;
    }
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]){
       int n = maze.length;
        if(x== n-1 && y== n-1 && maze[x][y]==1){
            sol[x][y]=1;
            printSol(sol);

            // REVISION: reset destination cell back to 0 after printing.
            // Reason: this call is about to return to its caller, which will then
            // try ITS remaining directions. If we left this cell marked 1 forever,
            // any other valid path that also ends at (n-1,n-1) would find it
            // already "visited" and get wrongly blocked from ever printing.
            sol[x][y]=0;
        return true;
        }
        if(isSafe(maze,x,y))
            {
            if(sol[x][y]==1)
                return false;
            sol[x][y]=1;

            // REVISION: replaced "return true" on first success with a 'found' flag.
            // Reason: returning immediately here would stop exploring the moment
            // ONE path was found, so remaining directions from this cell (and all
            // sibling branches further up the call stack) would never run.
            // We want ALL paths, so we just remember success and keep going.
            boolean found = false;

            if(solveMazeUtil(maze,x+1,y,sol))   // Down
                found = true;
            if(solveMazeUtil(maze,x,y+1,sol))   // Right
                found = true;

            // REVISION: added Up and Left calls (originally missing).
            // Reason: original code only tried Down/Right, so any path needing to
            // detour up or left around a blocked cell was never discovered, even
            // though the problem allows all 4 directions.
            if(solveMazeUtil(maze,x-1,y,sol))   // Up
                found = true;
            if(solveMazeUtil(maze,x,y-1,sol))   // Left
                found = true;

            // REVISION: reset this cell back to 0 (backtrack) after ALL 4
            // directions have been fully explored from here.
            // Reason: sol[x][y] is only meant to mark "part of the path currently
            // being tested" (to prevent infinite loops doubling back on itself).
            // Once every direction from (x,y) has finished, this cell is no longer
            // part of the path under test, so a DIFFERENT path arriving at (x,y)
            // from another direction later must be allowed to use it too.
            // Note: this does NOT cause duplicate paths — different branches only
            // exist because they take different moves, so their printed paths
            // always differ; the reset only prevents valid paths from being
            // wrongly skipped, it doesn't cause a path to be printed twice.
            sol[x][y]=0;

            return found;
            
        }    
        return false;
    
    } 
    public static void main(String args[]){
        int maze[][] = {{1,0,0,0}, {1,0,1,1}, {1,1,0,1}, {1,1,1,1}};
        solveMaze(maze,0,0);

    }
}