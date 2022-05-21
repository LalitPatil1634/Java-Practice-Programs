package Array.JavaTPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example17B {
    public static int getFirstLArgest(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total - 1);
        return element;
    }

    public static void main(String[] args) {
        Integer[] a = {2, 5, 3, 5, 7, 8, 9};
        Integer[] b = {45, 85, 47, 36, 95, 22};

        System.out.println("largest : " + getFirstLArgest(a, 7));
        System.out.println("largest : " + getFirstLArgest(b, 6));
    }
}
