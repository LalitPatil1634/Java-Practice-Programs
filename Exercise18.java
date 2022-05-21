package Array;

import java.util.Arrays;
//Write a Java program to find the second smallest element in an array
public class Exercise18 {
    public static void main(String[] args) {
        int[] my_array = {-1, 4, -4, 2, 7, -3};
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == min) {
                second_min = min;
            } else if (my_array[i] < min) {
                second_min = min;
                min = my_array[i];
            } else {
                second_min = my_array[i];
            }
        }
        System.out.println(second_min);
    }
}
