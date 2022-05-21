package Array;

//Write a Java program to test if an array contains a specific value
public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};

        System.out.println(contains(arr,1254));
        System.out.println(contains(arr,5243));
    }

    public static boolean contains(int[] arr, int item) {
        for (int i : arr) {
            if (item == i){
                return true;
            }
        }
        return false;
    }
}
