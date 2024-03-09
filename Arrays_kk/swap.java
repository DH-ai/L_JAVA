package Arrays_kk;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int []arr = {12,32,4,5,6};
        
        swapify(arr,0,arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }
    static void swapify(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }
}
