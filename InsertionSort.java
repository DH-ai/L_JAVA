public class InsertionSort {
    static void printarr(int[]arr){
        for (int i= 0 ; i<arr.length;i++){
            
            System.out.print(arr[i]+",");
        }
        
    }
 public static void main(String []argv){
    int []arr={4,2,8,7,44,34,43,10,3,5,6,18};

    for (int i =0 ; i<arr.length-1;i++){
        int current = arr[i+1];
        // for (int j = i ; j>=0;j--){
        //     if (arr[j+1]<arr[j]){

        //         arr[j+1]=arr[j];
        //         arr[j]=current;
        //     }
        // }
        int j=i;
        while(j>=0&&arr[j+1]<arr[j] ){
            arr[j+1]=arr[j];
            arr[j]=current;
            j--;
            

            System.out.println(j);
        }

    }
    printarr(arr);
 }
}
