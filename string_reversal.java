import java.util.Scanner;

public class string_reversal {
    static String rev(String pp ){
        char[] arr= new char[pp.length()];
        
        for (int i=0;i<pp.length();i++){

            arr[pp.length()-i-1]=pp.charAt(i);
        }
        pp= new String(arr);

        return pp;
    }
    public static void main (String[]argv){
        Scanner sc = new Scanner(System.in);
        String hello = sc.nextLine();
        hello = rev(hello);
        System.out.println(hello);

    }
    
}
