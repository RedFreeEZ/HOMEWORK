public class Matrix {
    int row;
    int column;
    int[][] declarationMatrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.declarationMatrix = new int[row][column];
    }

    public void PrintMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + declarationMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix SumMatrix(Matrix a, Matrix b) {
        Matrix Sum = new Matrix(a.row, b.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.column; j++) {
                Sum.declarationMatrix[i][j] = a.declarationMatrix[i][j] + b.declarationMatrix[i][j];
            }
        }
        return Sum;
    }
    public static Matrix MultiplicationMatrix(Matrix a, Matrix b) {
        Matrix Multiplication = new Matrix(a.row, b.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.column; j++){
                for (int n = 0; n < a.column; n++){
                    Multiplication.declarationMatrix[i][j] = Multiplication.declarationMatrix[i][j] + a.declarationMatrix[i][n] * b.declarationMatrix[n][j];
                }
            }
        }
        return Multiplication;
    }

    public static Matrix MultiplicationMatrixByNumber(Matrix a, int number) {
        Matrix Sum = new Matrix(a.row, a.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < a.column; j++) {
                Sum.declarationMatrix[i][j] = a.declarationMatrix[i][j] * number;
            }
        }
        return Sum;
    }


}
