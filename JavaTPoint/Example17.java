package Array.JavaTPoint;

public class Example17 {
    public static int getFirstLArgest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 5, 7, 8, 9};
        int[] b = {45, 85, 47, 36, 95, 22};

        System.out.println("Largest : " + getFirstLArgest(a, 7));
        System.out.println("Largest : " + getFirstLArgest(b, 6));
    }
}
