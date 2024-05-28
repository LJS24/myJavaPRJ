import java.util.Scanner;
public class Personal_33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] arr = new int[4][4];

        final int RowFinal = arr.length - 1;
        final int ColFinal = arr[0].length - 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row != RowFinal && col != ColFinal) {
                    arr[row][col] = (int) (Math.random() * 10 + 1);

                    arr[row][ColFinal] += arr[row][col];
                    arr[RowFinal][col] += arr[row][col];
                    arr[RowFinal][ColFinal] += arr[row][col];
                }
                System.out.printf("%4d ", arr[row][col]);
            }
            System.out.println();
        }

        s.close();
    }
}
