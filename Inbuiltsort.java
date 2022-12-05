import java.util.Arrays;
import java.util.Collections;
public class Inbuiltsort {
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {5,4,2,1,3};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,2);
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        printarr(arr);
    }
}
