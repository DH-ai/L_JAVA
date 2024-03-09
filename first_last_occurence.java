import java.util.Scanner;

public class first_last_occurence{

    public static int[] find(String sent, char let){
        
        int  first=0;
        int  last=0;
        for (int i = 0 ;i<sent.length();i++){
            if (sent.charAt(i)==let)first=i+1;break;
        }
        for (int i = sent.length()-1;i>=0;i--){
            
            if (sent.charAt(i)==let)last=i+1;break;
        }
    
    
        int[] arr ={first,last};
        return arr;
        
    }
    public static int[] rcrs(String sent, char let){
        int  first=0;
        int  last=0;
        int [] arr =new int[first];
        return arr ;
    }
    public static void main (String [ ]argv){
        Scanner sc = new Scanner(System.in);
        String go = sc.nextLine();
        char g='a';
        int []arr= find(go,g);
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        
    }


}