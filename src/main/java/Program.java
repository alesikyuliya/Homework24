import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] matrix1 = generateRandomMatrix();
        System.out.println("Average number = " + matrix.avgArray(matrix1));
        System.out.println(matrix.isMatrixSquare(matrix1));
        System.out.println();
        int[][] matrix2 = generateRandomMatrix();
        System.out.println("Average number = " + matrix.avgArray(matrix2));
        System.out.println(matrix.isMatrixSquare(matrix2));

    }

    private static int[][] generateRandomMatrix() {
        Random random = new Random();
        int i = random.nextInt(5) + 1;

        int[][] array = new int[i][];
        System.out.println(i);

        for (int m = 0; m < array.length; m++) {
            int randomLength = random.nextInt(5);
            array[m] = new int[randomLength];
            for (int n = 0; n < randomLength; n++) {
                array[m][n] = random.nextInt(10);

            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(Arrays.toString(array[k]));
        }
        return array;
    }


}
