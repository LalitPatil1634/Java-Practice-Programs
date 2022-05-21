package Array;

import java.util.Arrays;
//Write a Java program to remove a specific element from an array.
public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Before" + Arrays.toString(arr));

        int index = 1;

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After" + Arrays.toString(arr));
    }
}
