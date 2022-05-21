package Array.JavaTPoint;

import java.util.Arrays;

public class Example17A {
    public static int getFirstLArgest(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 5, 7, 8, 9};
        int[] b = {45, 85, 47, 36, 95, 22};

        System.out.println("largest : " + getFirstLArgest(a, 7));
        System.out.println("largest : " + getFirstLArgest(b, 6));
    }
}
