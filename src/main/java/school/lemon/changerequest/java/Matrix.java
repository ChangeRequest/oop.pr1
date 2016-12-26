package school.lemon.changerequest.java;

/**
 * Created by lera on 11.12.16.
 */
public class Matrix {
    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix(int rows, int columns) {
        if ((rows < 1) || (columns < 1)) {
            throw new IllegalArgumentException("Cannot create a matrix smaller that 1x1");
        } else {
            this.rows = rows;
            this.columns = columns;
            this.matrix = new double[rows][columns];
        }
    }

    public Matrix(double[][] matrix) {

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != matrix[0].length)
                throw new IllegalArgumentException("Illegal dimensions."); //verification that all rows has the same columns number
        }
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    private boolean checkSize(Matrix matrixB) {
        if ((this.rows != matrixB.rows) || (this.columns != matrixB.columns))
            throw new IllegalArgumentException("Illegal dimensions.");
        return true;
    }

    public Matrix add(Matrix matrixB) {

        checkSize(matrixB);

        Matrix matrixAplusB = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixAplusB.matrix[i][j] = matrix[i][j] + matrixB.matrix[i][j];
            }
        }
        return matrixAplusB;
    }

    public Matrix sub(Matrix matrixB) {

        checkSize(matrixB);

        Matrix matrixAsubtractB = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixAsubtractB.matrix[i][j] = matrix[i][j] - matrixB.matrix[i][j];
            }
        }
        return matrixAsubtractB;
    }

    public Matrix mul(Matrix matrixB) {

        if (this.columns != matrixB.rows) throw new IllegalArgumentException("Illegal dimensions.");

        Matrix multiplyMatrix = new Matrix(rows, columns);
        double count = 0.;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrixB.columns; j++) {
                for (int index = 0; index < columns; index++) {
                    count += matrix[i][index] * matrixB.matrix[index][j];
                }
                multiplyMatrix.matrix[i][j] = count;
                count = 0.;
            }
        }
        return multiplyMatrix;
    }

    public Matrix mul(int number) {
        Matrix matrixMultiplyNumber = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixMultiplyNumber.matrix[i][j] = matrix[i][j] * number;
            }
        }
        return matrixMultiplyNumber;
    }

    public Matrix transpositionMatrix() {
        Matrix transpositionMatrix = new Matrix(columns, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpositionMatrix.matrix[j][i] = matrix[i][j];
            }
        }
        return transpositionMatrix;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                str.append(this.matrix[i][j]).append("\t\t");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
