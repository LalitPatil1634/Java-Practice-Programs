package Array;

import java.util.ArrayList;

//Write a Java program to convert an ArrayList to an array.
public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add(".Net");
        list.add("C");
        list.add("C++");
        list.add("C#");
        list.add("Python");

        String[] my_array = new String[list.size()];

        list.toArray(my_array);
        for (String str : my_array) {
            System.out.println(str);
        }
    }
}
