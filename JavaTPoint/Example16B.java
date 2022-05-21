package Array.JavaTPoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example16B {
    public static int getSecond(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total - 2);
        return element;
    }

    public static void main(String[] args) {
        Integer[] a = {12, 53, 64, 78, 95, 201};
        Integer[] b = {45, 17, 65, 21, 85, 68};
        System.out.println("Second largest : " + getSecond(a, 6));
        System.out.println("Second largest : " + getSecond(b, 6));
    }
}
