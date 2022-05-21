package Array.JavaTPoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example15B {
    public static int getThirdLargest(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element;
        element = list.get(total - 3);
        return element;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 5, 44, 46, 4, 81, 3, 5, 21};
        Integer[] b = {5, 421, 4, 56, 531, 45, 6462, 3};

        System.out.println("Third largest " + getThirdLargest(a, 10));
        System.out.println("Third largest " + getThirdLargest(b, 8));
    }
}
