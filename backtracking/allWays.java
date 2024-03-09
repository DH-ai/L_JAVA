package backtracking;

import java.util.Arrays;
public class allWays {
    public static void main(String[] args) {
        boolean [][] maze ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
            allways("",maze, 0, 0);
        int [][] path={
            {0,0,0},
            {0,0,0},
            {0,0,0},
        };
        printPath("", maze, 0, 0,path,1);
    }


    static void allways(String s,boolean [][]maze,int n,int m){
        if (n==maze.length-1 && m == maze[0].length-1){
            System.out.println(s);
            return ;
        }
        if (!maze[n][m])return;
        maze[n][m]=false;
        if (n<maze.length-1){
            
            allways(s+"D", maze, n+1, m);
            
        }
        if (n>0){
            
            allways(s+"U", maze, n-1, m);
            
        }
        if (m<maze[0].length-1){
            
            allways(s+"R", maze, n, m+1);
            
        }
        if (m>0){
            
            allways(s+"L", maze, n, m-1);
            
        }
        maze[n][m]=true;
        
    }
    static void printPath(String s, boolean[][] maze, int row, int col, int[][] path, int i) {
        // Base case: Reach the bottom-right corner
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col]= i;
            for (int[]arr:path){

                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }
    
        // Mark the current cell as visited
        maze[row][col] = false;
        path[row][col] = i;
    
        // Recursive calls for moving in different directions
    
        // Down
        if (row < maze.length - 1 && maze[row + 1][col]) {
            printPath(s + "D", maze, row + 1, col, path, i + 1);
        }
    
        // Up
        if (row > 0 && maze[row - 1][col]) {
            printPath(s + "U", maze, row - 1, col, path, i + 1);
        }
    
        // Right
        if (col < maze[0].length - 1 && maze[row][col + 1]) {
            printPath(s + "R", maze, row, col + 1, path, i + 1);
        }
    
        // Left
        if (col > 0 && maze[row][col - 1]) {
            printPath(s + "L", maze, row, col - 1, path, i + 1);
        }
    
        // Backtrack: Mark the current cell as unvisited
        maze[row][col] = true;
        path[row][col] = 0;
    }
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
    
}
