package Array.JavaTPoint;

/*
Program to print the largest element in an array
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
STEP 3: max = arr[0]
STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
STEP 5: if(arr[i]>max) max=arr[i]
STEP 6: PRINT "Largest element in given array:"
STEP 7: PRINT max
STEP 8: END
 */
public class Example9 {
    public static void main(String[] args) {
        int[] arr = new int[]{25, 11, 7, 75, 56};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            //Compare element of array with max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
