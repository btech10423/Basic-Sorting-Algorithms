import java.util.*;

public class Assignment2 {
    public static void reversebubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void reverseselectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void reverseinsertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int curr = arr[i];
            while (j >= 0 && arr[j] < curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void reversecountingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i <arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length-1; i >=0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // reversebubblesort(arr);
        // reverseselectionsort(arr);
        // reverseinsertionsort(arr);
         reversecountingsort(arr);
        printarr(arr);
    }
}