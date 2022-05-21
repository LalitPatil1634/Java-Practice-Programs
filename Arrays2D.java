package Array;

public class Arrays2D {
    public static void main(String[] args) {
        char [][]names = new char[][] {
                {'l','a','l','i','t'},
                {'k','i','r','a','n','l'}
        };
        for (int row = 0; row <names.length;row++){
            for (int col = 0;col<names[row].length;col++){
                System.out.print(names[row][col]);
            }
            System.out.println();
        }

    }
}
