package Array.JavaTPoint;

import java.util.Arrays;

public class SortArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
        System.out.println("Array element before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray element after sorting: ");
        sortArray(arr, arr.length);
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            int a = arr[i];
            while ((j > 0) && (arr[j - 1] > a)) { //return true when both condition are true
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = a;
        }

    }
}