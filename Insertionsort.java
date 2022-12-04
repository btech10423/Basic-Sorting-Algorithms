import java.util.*;
public class Insertionsort{
public static void insertionsort(int arr[]){
    for(int i=1; i<arr.length;i++){
        int curr=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>curr){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=curr;
    }
}
public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
public static void main(String args[])
{
    int arr[] = {5,4,3,2,1};
    insertionsort(arr);
    printarr(arr);
}
}
