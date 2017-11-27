package school.lemon.changerequest.java.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private double value[][];
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        if (rows <= 0 || columns <= 0)
            throw new NegativeArraySizeException("Rows <= 0 or columns <= 0");
        this.rows = rows;
        this.columns = columns;
        value = new double[rows][columns];
    }

    public Matrix(Matrix matrix) {
        this(matrix.rows, matrix.columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                value[i][j] = matrix.value[i][j];
    }

    public Matrix add(Matrix matrix) {
        if (!isSameSize(matrix))
            throw new IllegalArgumentException("Matrixes have different sizes");
        Matrix result = new Matrix(this);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result.value[i][j] += matrix.value[i][j];
        return result;
    }

    public Matrix subtract(Matrix matrix) {
        if (!isSameSize(matrix))
            throw new IllegalArgumentException("Matrixes have different sizes");
        Matrix result = new Matrix(this);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result.value[i][j] -= matrix.value[i][j];
        return result;
    }

    public Matrix multiply(int n) {
        Matrix result = new Matrix(this);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result.value[i][j] *= n;
        return result;
    }

    public Matrix multiply(Matrix matrix) {
        if (columns != matrix.rows)
            throw new IllegalArgumentException("Matrixes aren`t compatible");
        Matrix result = new Matrix(rows, matrix.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result.value[i][j] += value[i][k] * matrix.value[k][j];
                }
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix result = new Matrix(columns, rows);
        for (int i = 0; i < columns; i++)
            for (int j = 0; j < rows; j++)
                result.value[i][j] = value[j][i];
        return result;
    }

    private boolean isSameSize(Matrix matrix) {
        if (columns == matrix.columns && rows == matrix.rows)
            return true;
        return false;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                result.append(value[i][j]).append(' ');
            result.append('\n');
        }
        return result.toString();
    }

    public void fillWithRandomIntegers(Random rnd, int maxPossibleValue) {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                value[i][j] = rnd.nextInt(maxPossibleValue);
    }

    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (!(getClass() == obj.getClass()))
            return false;
        else {
            Matrix tmp = (Matrix) obj;
            if (columns != tmp.columns || rows != tmp.rows)
                return false;
            return Arrays.equals(value, tmp.value);
        }
    }
}
