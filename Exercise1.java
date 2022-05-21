package Array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to sort a numeric array and a string array.
public class Exercise1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        String k = sc.next();
//        String[] arr2 = new String[Integer.parseInt(k)];
//        for (int j = 0; j < k; j++) {
//            arr2[j] = sc.next();
//        }
//        System.out.println();
        int[] arr = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        String[] arr2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        System.out.println("Original" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sortes" + Arrays.toString(arr));

        System.out.println("Original"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted"+Arrays.toString(arr2));
    }
}
