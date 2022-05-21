package Array.JavaTPoint;

/*
Java Program to print the sum of all the items of the array
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
STEP 3: SET sum = 0
STEP 4: REPEAT STEP 5 UNTIL i<arr.length
            //for(i=0; i< arr.length; i++)
STEP 5: sum = sum + arr[i]
STEP 6: PRINT "Sum of all the elements of an array:"
STEP 7: PRINT sum
STEP 8: END
 */
public class Example11 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
