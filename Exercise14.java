package Array;

import java.util.Arrays;
import java.util.HashSet;
//Write a Java program to find the common elements between two arrays (string values).
public class Exercise14 {
    public static void main(String[] args) {
        String[] arr1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] arr2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));

        HashSet<String> set = new HashSet<>();

        for (String s : arr1) {
            for (String value : arr2) {
                if ((s.equals(value))) {
                    set.add(s);
                }
            }
        }
        System.out.println("Common Element: " + (set));
    }
}
