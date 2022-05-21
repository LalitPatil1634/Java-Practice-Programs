package Array.JavaTPoint;

/*
Program to print the elements of an array present on even position
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
STEP 3: PRINT "Elements of given array present on even position:"
STEP 4: REPEAT STEP 5 for(i=1; i< arr.length; i= i+2)
STEP 5: PRINT arr[i]
STEP 6: END
 */
public class Example7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of given array present on even position : ");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

    }
}
