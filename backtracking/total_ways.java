package backtracking;
import java.util.ArrayList;

public class total_ways {
    public static void main(String[] args) {
        int n =3;
        int m =3;
        int [] obstacle = {2,2};
        int nop = no_of_ways(n,m,obstacle);
        System.out.println(nop);
        // path("",n,m);
        // System.out.println(pathretDia("", n, m,obstacle));
        boolean [][] maze ={
            {true,true,true},
            {true,false,true},
            {false,true,true}
        };
        System.out.println(pathRestDiag("",maze,0,0));
        
    }
    static int no_of_ways(int n,int m,int [] obstacle){
        if(n ==1 || m ==1){
            return 1;
        }
        if (obstacle[0]==n && obstacle[1]==m){
            return 0;
        }
        int right = no_of_ways(n, m-1,obstacle);
        int down = no_of_ways(n-1, m,obstacle);
        int diag = no_of_ways(n-1, m-1,obstacle);

        return right+down+diag;
    }
    static void path(String s, int n,int m){
        if(n ==1 && m ==1){
            System.out.println(s);
            return ;
        }
        if (n>1){
            path(s + "D",n-1,m);
        }
        if (m>1){
            path(s+"R",n,m-1);
        }
        
    }
    static ArrayList<String> pathret(String s, int n,int m){
        if(n ==1 && m ==1){
            ArrayList<String> path = new ArrayList<>();
            path.add(s);

            return path ;
        }
        ArrayList<String> list = new ArrayList<>();
        if (n>1){
            list.addAll(pathret(s + "D",n-1,m));
        }
        if (m>1){
            list.addAll(pathret(s+"R",n,m-1));
        }
        return list;
    }
    static ArrayList<String> pathretDia(String s, int n,int m,int [] obstacle){
        if(n ==1 && m ==1){
            ArrayList<String> path = new ArrayList<>();
            path.add(s);

            return path ;
        }
        ArrayList<String> list = new ArrayList<>();
        if (obstacle[0]==n && obstacle[1]==m){
            ArrayList<String> path = new ArrayList<>();
            path.add("");

            return path ;
        }   
        if (n>1){
            list.addAll(pathretDia(s + "D",n-1,m,obstacle));
        }
        if (m>1){
            list.addAll(pathretDia(s+"R",n,m-1,obstacle));
        }
        if (m>1 && n>1){
            list.addAll(pathretDia(s+"d", n-1, m-1,obstacle));
        }
        return list;
    }
    static ArrayList<String> pathRestDiag(String s,boolean[][]maze, int n,int m){
        if(n ==maze.length-1 && m ==maze[1].length-1){
            ArrayList<String> path = new ArrayList<>();
            path.add(s);
            
            return path ;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[n][m]){
            ArrayList<String> path = new ArrayList<>();
            
            
            return path ;
        }
        
        if (n<maze.length - 1){
            list.addAll(pathRestDiag(s + "D",maze,n+1,m));
        }
        if (m<maze.length - 1){
            list.addAll(pathRestDiag(s+"R",maze,n,m+1));
        }
        if (m<maze.length - 1 && n<maze.length - 1){
            list.addAll(pathRestDiag(s+"d",maze, n+1, m+1));
        }
        return list;
    }
    
}
