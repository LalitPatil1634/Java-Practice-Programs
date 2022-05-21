package Array.JavaTPoint;

/*
Java Program to Find 2nd Largest Number in an array
*/
public class Example16 {
    public static int getSecond(int[] a, int total) {
        int temp;

        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 8, 6, 9, 5,};
        int[] b = {12, 18, 16, 14, 13, 11};

        System.out.println("Second largest : " + getSecond(a, 6));
        System.out.println("Second largest : " + getSecond(b, 6));
    }
}
