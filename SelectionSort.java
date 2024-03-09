import java.util.Scanner;

public class SelectionSort {
    static void printArray (int array[]){
        System.out.print("[");
        for (int i=0 ; i<array.length;i++){
            
            System.out.print(array[i]+",");
        }
        System.out.print("]");

    }
    
    public static void main (String []argv){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Select your 1d array size: ");
        int n = scan.nextInt();
        System.out.println("Now select the elements ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("ELement no. %d is :",i+1);
            arr[i]= scan.nextInt();
            System.out.println("");

        }
        for (int i =0 ; i<arr.length;i++){
            int smallest= arr[i];
        
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>=arr[j]){
                    smallest=arr[j];
                    arr[j]=arr[i];
                    arr[i]=smallest;
                }
                
            }

        }
        printArray(arr);
        
    }
}

// not running dunno why
