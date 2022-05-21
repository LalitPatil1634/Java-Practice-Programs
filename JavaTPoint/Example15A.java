package Array.JavaTPoint;

import java.util.Arrays;

public class Example15A {
    public static int getThirdLargest(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 3];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 44, 46, 4, 81, 3, 5, 21};
        int[] b = {5, 421, 4, 56, 531, 45, 6462, 3};

        System.out.println("Third largest " + getThirdLargest(a, 10));
        System.out.println("Third largest " + getThirdLargest(b, 8));
    }
}
