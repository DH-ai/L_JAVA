import java.util.Scanner;

public class BubbleSort {
    public static void  main(String []argv){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Select your 1d array size: ");
        int n = scan.nextInt();
        System.out.println("Now select the elements ");
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("ELement no. %d is :",i+1);
            array[i]= scan.nextInt();
            System.out.println("");

        }
        for (int j=0;j<n-1;j++){

            for (int i=0; i<n-j-1; i++){
                int help;
                if (array[i]>=array[i+1]){
                    help = array[i+1];
                    array[i+1]=array[i];
                    array[i]= help;
                }
            }
        }
        System.out.print("[");
        for (int i=0 ; i<n;i++){
            
            System.out.print(array[i]+",");
        }
        System.out.print("]");
        scan.close();
        
    }
}
// time complexity is O(n^2)