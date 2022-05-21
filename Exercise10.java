package Array;

import java.util.Arrays;

//Write a Java program to find the maximum and minimum value of an array.
public class Exercise10 {
    static int max;
    static int min;

    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        maxMin(arr);
        System.out.println("Original array" + Arrays.toString(arr));
        System.out.println("Minimum value for the above array " + min);
        System.out.println("Maximum value for the above array " + max);
    }

    public static void maxMin(int[] arr) {
        max = arr[0];
        min = arr[0];
        int len = arr.length;

        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) max = arr[i];
                if (arr[i + 1] < min) min = arr[i + 1];
            }
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min) min = arr[i];
                if (arr[i + 1] > max) max = arr[i + 1];
            }
        }

    }
}
