import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    private Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void avgArray() {
        int[][] matrix1 = new int[][]{{1, 1, 5}, {5, 5, - 5, 6}, {8, 8, 8, 4, 5, 6}, {1, 2}};
        assertEquals(matrix.avgArray(matrix1), 4);
    }

    @Test
    void isMatrixSquare() {
        int[][] matrix1 = new int[5][5];
        assertEquals(matrix.isMatrixSquare(matrix1), true);
        int[][] matrix2 = new int[][]{{1, 1, 5}, {5, 5, 6}, {8, 8, 8, 4, 5, 6}, {1, 2}};
        assertEquals(matrix.isMatrixSquare(matrix2), false);
        int [][] matrix3 = null;
        assertEquals(matrix.isMatrixSquare(matrix3), false);
        int[][] matrix4 = new int[0][0];
        assertEquals(matrix.isMatrixSquare(matrix4), false);
        int[][] matrix5 = new int[5][6];
        assertEquals(matrix.isMatrixSquare(matrix5), false);
    }
}