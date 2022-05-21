package Array;

import java.util.Arrays;

//Write a Java program to remove duplicate elements from an array.
public class Exercise16 {
    static void unique_array(int[] arr) {
        //Assuming all elements in input array are unique
        int no_unique_elements = arr.length;

        //Comparing each element with all other elements
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i + 1; j < no_unique_elements; j++) {
                //If any two elements are found equal
                if (arr[i] == arr[j]) {
                    //Replace duplicate element with last unique element
                    arr[j] = arr[no_unique_elements - 1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
        int[] arr2 = Arrays.copyOf(arr,no_unique_elements);
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        unique_array(new int[]{0, 3, -2, 4, 3, 2});
        unique_array(new int[]{10, 22, 10, 20, 11, 22});
    }
}
