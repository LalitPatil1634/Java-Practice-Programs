package Array.JavaTPoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Java to Program Find 2nd Smallest Number in an array
 */
public class Example18 {
    public static int getSecondSmallest(Integer[] arr, int total) {
        int temp;
        /*
        First Approach
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
         */
        /*
        Second Approach
        Find 2nd Smallest Number in Array using Arrays
        Arrays.sort(arr);
        return arr[1];
         */
        /*
        Third approach
        Find 2nd Smallest Number in Array using Collections
         */
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int element;
        element = list.get(1);
        return element;

    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 6, 3, 2, 4, 8};
        Integer[] arr2 = {65, 56, 22, 14, 16, 13, 14};

        System.out.println("Second smallest : " + getSecondSmallest(arr1, 6));
        System.out.println("Second smallest : " + getSecondSmallest(arr2, 7));
    }
}
