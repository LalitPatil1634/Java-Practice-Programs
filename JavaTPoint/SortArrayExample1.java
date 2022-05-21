package Array.JavaTPoint;

import java.util.Arrays;

public class SortArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
//        Arrays.sort(arr);
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
