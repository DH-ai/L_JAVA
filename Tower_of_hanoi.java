public class Tower_of_hanoi {
    
    public static void main (String[]argv){
        int N = 3;
        int step=0;
        
        hanoi(N, 'A', 'C', 'B');
        System.err.println(step);

    }
    static void hanoi(int n, char main_rod,char final_rod, char helper_rod){
        if (n==0){
            return ;
        }
        hanoi(n-1,main_rod,helper_rod,final_rod);
        System.out.printf("move disk %d from %c to %c \n",n,main_rod,final_rod);
        
        hanoi(n-1,helper_rod,final_rod,main_rod);
   

    
        
    }
    
}
