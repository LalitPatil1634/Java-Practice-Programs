package Array;

import java.util.Arrays;
//Write a Java program to copy an array by iterating the array.
public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Source array" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i];
        }
        System.out.println("New array" + Arrays.toString(arr));
    }
}
