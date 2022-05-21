package Array.JavaTPoint;

import java.util.Arrays;

/*
Java Program to right rotate the elements of an array
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] ={1, 2, 3, 4, 5 }.
STEP 3: SET n =3
STEP 4: PRINT "Original Array"
STEP 5: REPEAT STEP 6 UNTIL i<arr.length
            //for(i=0; i<arr.length; i++)
STEP 6: PRINT arr[i]
STEP 7: REPEAT STEP 8 to STEP 12 UNTIL i<n
            // for(i=0; i<n; i++ )
STEP 8: DEFINE j, last.
STEP 9: last = arr[arr.length-1]
STEP 10: REPEAT STEP 11 UNTIL j>0
            //for(j= arr.length-1;j>0; j--)
STEP 11: arr[j]= arr[j-1]
STEP 12: arr[0]= last
STEP 13: PRINT "Array after right rotation"
STEP 14: REPEAT STEP 15 UNTIL i<arr.length
            //for(i=0; i<arr.length; i++)
STEP 15: PRINT arr[i]
STEP 16: END
*/
public class Example12 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, last;
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("\nArray after right rotation : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
