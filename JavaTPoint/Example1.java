package Array.JavaTPoint;

import java.util.Arrays;

//Java Program to copy all elements of one array into another array
/*
STEP 1: START
STEP 2: INITIALIZE arr1[] ={1, 2, 3, 4, 5}
STEP 3: CREATE arr2[] of size arr1[].
STEP 4: COPY elements of arr1[] to arr2[]
STEP 5: REPEAT STEP 6 UNTIL (i<arr1.length)
STEP 6: arr2[i] =arr1[i]
STEP 7: DISPLAY elements of arr1[].
STEP 8: REPEAT STEP 9 UNTIL (i<arr1.length)
STEP 9: PRINT arr1[i]
STEP 10: DISPLAY elements of arr2[].
STEP 11: REPEAT STEP 12 UNTIL (i<arr2.length)
STEP 12: PRINT arr2[i].
STEP 13: END
*/
public class Example1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
