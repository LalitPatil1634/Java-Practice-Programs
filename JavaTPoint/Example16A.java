package Array.JavaTPoint;

import java.util.Arrays;

public class Example16A {
    public static int getSecond(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 2];
//        int temp;
//        for (int i = 0; i < total; i++) {
//            for (int j = i + 1; j < total; j++) {
//                if (a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        return a[total - 1]
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 3, 7, 9};
        int[] b = {1, 5, 2, 5, 6, 3, 7};

        System.out.println("First largest : " + getSecond(a, 6));
        System.out.println("First largest : " + getSecond(b, 7));

    }
}
