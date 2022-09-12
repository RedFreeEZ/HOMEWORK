import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();// Объявляем рандомные переменные

        Matrix a = new Matrix(2,2);// Заполняем размерность матрицы а (3 на 3)
        Matrix b = new Matrix(2,2);// Заполняем размерность матрицы b (3 на 3)

        int number = 3; // Число на которое умножаем
        //Заполнение массива случайными числами
        for(int i = 0; i < a.row; i++){
            for(int j = 0; j < a.column; j++){
                a.declarationMatrix[i][j] = random.nextInt(1,11);
                b.declarationMatrix[i][j] = random.nextInt(1,11);
            }
        }
//Вывод результатов
        System.out.println("Matrix а");

        a.PrintMatrix();

        System.out.println("Matrix b");

        b.PrintMatrix();

        System.out.println("a + b");

        Matrix resultPlus = Matrix.SumMatrix(a, b);

        resultPlus.PrintMatrix();

        System.out.println("a * " + number);

        Matrix resultMultiplicationMatrixByNumber = Matrix.MultiplicationMatrixByNumber(a, number);

        resultMultiplicationMatrixByNumber.PrintMatrix();

        System.out.println("a * b");

        Matrix resultMultiplicationMatrix = Matrix.MultiplicationMatrix(a, b);

        resultMultiplicationMatrix.PrintMatrix();
    }
}