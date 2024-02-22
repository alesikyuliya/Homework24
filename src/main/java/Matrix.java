public class Matrix {
    public double avgArray(int[][] array) {
        double avg = 0;
        int sum = 0;
        int elementCount = 0;
        for (int[] num1: array) {
            for (int num2: num1){
                sum += num2;
                elementCount += 1;
            }

        }
        avg = (double) sum / elementCount;
        return avg;
    }

    public boolean isMatrixSquare(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        if (matrix.length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                return false;
            }
        }
        return true;
    }
}
