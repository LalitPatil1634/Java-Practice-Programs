package Array;

import java.util.ArrayList;
import java.util.Arrays;

//Write a Java program to convert an array to ArrayList
public class Exercise20 {
    public static void main(String[] args) {
        String[] my_array = new String[]{"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_array));

        System.out.println(list);
    }
}
