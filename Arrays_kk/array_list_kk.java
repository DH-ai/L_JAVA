package Arrays_kk;
import java.util.ArrayList;
import java.util.Scanner;

public class array_list_kk {
    public static void main(String[]argv){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(14);
        list.add(13);
        // Size not specified still it works

        // Multi Dimensional Arrays 
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> md_list = new ArrayList<>();
        
        for (int i = 0 ; i <3 ;i++){md_list.add(new ArrayList<>());} // to add list at individual index 

        // To fill the elemensts of multidimensional array
        for(int i = 0 ; i<3;i++){for (int j = 0 ;j<3;j++){md_list.get(i).add(in.nextInt());}}
        System.out.println(md_list);
        in.close();
    }
}
