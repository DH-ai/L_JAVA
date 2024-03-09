package Arrays_kk;
import java.util.Arrays;
import java.util.Scanner;

public class arrays_kk {
    public static void main(String []args){

        // int[] ros ; 
        // ros = new int[5];   
        // System.out.println(ros[0]);

        int [][] arr = new int[2][3];

        Scanner sc = new Scanner(System.in);
        for (int i =0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
    }
}
