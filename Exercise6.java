package Array;
//Write a Java program to find the index of an array element
public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println(findIndex(arr, 15));
    }

    public static int findIndex(int[] arr, int t) {
        if (arr == null)
            return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t)
                return i;
            else
                i += 1;
        }
        return -1;
    }
}
