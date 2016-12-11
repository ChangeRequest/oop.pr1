package school.lemon.changerequest.java;

import java.io.PrintStream;

/**
 * Created by lera on 11.12.16.
 */
public class Matrix {

    public static int rowsCount(int matrix[][]) {
        if (matrix == null) return 0;
        int rows = matrix.length;
        return rows;
    }

    public static int columnsCount(int matrix[][]) {
        if (matrix == null) return 0;
        int columns = matrix[0].length;
        return columns;
    }


    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null) return new int[0][0];
        if (matrixA.length != matrixB.length && matrixA[0].length != matrixB[0].length) return new int[0][0];
        int[][] matrixAplusB = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixAplusB[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixAplusB;
    }

    public static int[][] subtractMatrix(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null) return new int[0][0];
        if (matrixA.length != matrixB.length && matrixA[0].length != matrixB[0].length) return new int[0][0];

        int[][] matrixAsubtractB = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixAsubtractB[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixAsubtractB;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null) return new int[0][0];
        if (matrixA[0].length != matrixB.length || matrixB[0].length != matrixA.length) return new int[0][0];

        int[][] matrixMultiply = new int[matrixA.length][matrixB[0].length];
        int count = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                for (int index = 0; index < matrixA[0].length; index++) {
                    count += matrixA[i][index] * matrixB[index][j];
                }
                matrixMultiply[i][j] = count;
                count = 0;
            }
        }
        return matrixMultiply;
    }


    public static int[][] multiplyMatrixNumber(int[][] matrixA, int number) {
        if (matrixA == null) return new int[0][0];
        int[][] matrixMultiplyNumber = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixMultiplyNumber[i][j] = matrixA[i][j] * number;
            }
        }
        return matrixMultiplyNumber;
    }

    public static int[][] transpositionMatrix(int[][] matrixA) {
        if (matrixA == null) return new int[0][0];
        int[][] transpositionMatrix = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                transpositionMatrix[i][j] = matrixA[j][i];
            }
        }
        return transpositionMatrix;
    }


    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        matrixA[0][0] = 4;
        matrixA[0][1] = 2;
        matrixA[1][0] = 9;
        matrixA[1][1] = 0;
        int[][] matrixB = new int[2][2];
        matrixB[0][0] = 3;
        matrixB[0][1] = 1;
        matrixB[1][0] = -3;
        matrixB[1][1] = 4;

        System.out.println(columnsCount(matrixA));
        System.out.println("______________________");
        System.out.println(rowsCount(matrixA));
        System.out.println("______________________");

        int[][] matrixAplusB = addMatrix(matrixA, matrixB);
        for (int i = 0; i < matrixAplusB.length; i++) {
            for (int j = 0; j < matrixAplusB[0].length; j++) {
                System.out.print(matrixAplusB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________");

        int[][] matrixAsubtractB = subtractMatrix(matrixA, matrixB);
        for (int i = 0; i < matrixAsubtractB.length; i++) {
            for (int j = 0; j < matrixAsubtractB[0].length; j++) {
                System.out.print(matrixAsubtractB[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("______________________");

        int[][] matrixMultiplyNumber = multiplyMatrixNumber(matrixA, 5);
        for (int i = 0; i < matrixMultiplyNumber.length; i++) {
            for (int j = 0; j < matrixMultiplyNumber[0].length; j++) {
                System.out.print(matrixMultiplyNumber[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("______________________");

        int[][] multiplyMatrix = multiplyMatrix(matrixA, matrixB);
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[0].length; j++) {
                System.out.print(multiplyMatrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("______________________");

        int[][] transpositionMatrix = transpositionMatrix(matrixA);
        for (int i = 0; i < transpositionMatrix.length; i++) {
            for (int j = 0; j < transpositionMatrix[0].length; j++) {
                System.out.print(transpositionMatrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
