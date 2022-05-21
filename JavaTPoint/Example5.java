package Array.JavaTPoint;

import java.util.Arrays;

//Java Program to print the elements of an array
/*
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}.
STEP 3: PRINT "Elements of given array:"
STEP 4: REPEAT STEP 5 for(i=0; i<arr.length; i++)
STEP 5: PRINT arr[i]
STEP 6: END
*/
public class Example5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("" + Arrays.toString(arr));

    }
}
