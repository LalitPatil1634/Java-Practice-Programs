package Array;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array
public class Exercise9 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexPos = 3;
        int newValue = 16;

        System.out.println("Source array" + Arrays.toString(arr));

        for (int i = arr.length - 1; i > indexPos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexPos] = newValue;
        System.out.println("Modified array" + Arrays.toString(arr));
    }
}
