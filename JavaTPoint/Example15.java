package Array.JavaTPoint;

/*
Java Program to find Third Largest Number in an Array
 */
public class Example15 {
    public static int getThirdLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {  //if we want smallest element then only do < in if condition.
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        int[] b = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Third largest : " + getThirdLargest(a, 6));
        System.out.println("Third largest : " + getThirdLargest(b, 7));
    }
}
