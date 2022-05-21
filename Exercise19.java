package Array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to add two matrices of the same size.
public class Exercise19 {
    public static void main(String[] args) {
        int row, col, i, j;

        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
