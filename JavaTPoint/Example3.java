package Array.JavaTPoint;

import java.util.Arrays;

//Java Program to left rotate the elements of an array
/* Algorithm
        STEP 1: START
        STEP 2: INITIALIZE arr[] ={1, 2, 3, 4, 5 }.
        STEP 3: SET n =3
        STEP 4: PRINT "Original Array"
        STEP 5: REPEAT STEP 6 for(i=0; i<arr.length; i++)
        STEP 6: PRINT arr[i]
        STEP 7: REPEAT STEP 8 to STEP 12 for(i=0; i<n; i++ )
        STEP 8: DEFINE j, first.
        STEP 9: first = arr[0]
        STEP 10: REPEAT STEP 11 for(j= 0; j<arr.length-1; j++)
        STEP 11: arr[j]= arr[j+1]
        STEP 12: arr[j]= first
        STEP 13: PRINT "Array after left rotation"
        STEP 14: REPEAT STEP 15 for(i=0; i<arr.length; i++)
        STEP 15: PRINT arr[i]
        STEP 16: END
 */
public class Example3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("Original Array\n" + Arrays.toString(arr));
//        for (int i = 0; i < args.length;i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[j] = first;
        }
        System.out.println("Array after left rotation");
//        for (int i = 0; i < arr.length;i++) {
//            System.out.print(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));


    }
}
