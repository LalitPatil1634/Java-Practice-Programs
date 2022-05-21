package Array;

public class Exercise13 {
    public static void main(String[] args) {
        String[] arr = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i].equals(arr[j])) && (i != j)) {
                    System.out.println("Duplicate Elemets: " + arr[j]);
                }
            }
        }
    }
}
