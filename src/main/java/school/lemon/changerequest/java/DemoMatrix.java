package school.lemon.changerequest.java;

/**
 * Created by lera on 12.12.16.
 */
public class DemoMatrix {
    public static void main(String[] args) {


        double[][] matrix_A = {{4., 2.}, {9., 0.}};
        Matrix matrixA = new Matrix(matrix_A);

        double[][] matrix_B = {{3.0, 1.0}, {-3.0, 4.}};
        Matrix matrixB = new Matrix(matrix_B);

        System.out.print("Matrix A" + "\n" + matrixA.toString());
        System.out.println("______________");
        System.out.print("Matrix B" + "\n" + matrixB.toString());
        System.out.println("______________");
        System.out.print("Add matrix" + "\n" + matrixA.add(matrixB).toString());
        System.out.println("______________");
        System.out.print("Subtract matrix" + "\n" + matrixA.sub(matrixB).toString());
        System.out.println("______________");
        System.out.print("Multiply by a number" + "\n" + matrixA.mul(5).toString());
        System.out.println("______________");
        System.out.print("Multiply matrix" + "\n" + matrixA.mul(matrixB).toString());
        System.out.println("______________");
        System.out.print("Transposition matrix" + "\n" + matrixA.transpositionMatrix().toString());
        System.out.println("______________");


    }

}
