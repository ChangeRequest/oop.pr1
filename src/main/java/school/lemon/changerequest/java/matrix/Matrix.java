package school.lemon.changerequest.java.matrix;

import java.util.Random;

public class Matrix {
    private int value[][];
    private int row;
    private int column;

    public Matrix add(Matrix matrix) {
        if (!isSameSize(matrix))
            return null;
        Matrix result = new Matrix(this);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                result.value[i][j] += matrix.value[i][j];
        return result;
    }

    public Matrix subtract(Matrix matrix) {
        if (!isSameSize(matrix))
            return null;
        Matrix result = new Matrix(this);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                result.value[i][j] -= matrix.value[i][j];
        return result;
    }

    public Matrix multiply(int n) {
        Matrix result = new Matrix(this);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                result.value[i][j] *= n;
        return result;
    }

    public Matrix multiply(Matrix matrix) {
        if (column != matrix.row)
            return null;
        Matrix result = new Matrix(row, matrix.column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix.column; j++) {
                for (int k = 0; k < column; k++) {
                    result.value[i][j] += value[i][k] * matrix.value[k][j];
                }
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix result = new Matrix(column, row);
        for (int i = 0; i < column; i++)
            for (int j = 0; j < row; j++)
                result.value[i][j] = value[j][i];
        return result;
    }

    private boolean isSameSize(Matrix matrix) {
        if (column != matrix.column || row != matrix.row)
            return false;
        return true;
    }

    public Matrix(int row, int column) {
        if (row <= 0 || column <= 0)
            throw new IllegalArgumentException("Row and column must be positive");
        this.row = row;
        this.column = column;
        value = new int[row][column];
    }

    public Matrix(Matrix matrix) {
        this(matrix.row, matrix.column);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                value[i][j] = matrix.value[i][j];
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                result.append(value[i][j]).append(' ');
            result.append('\n');
        }
        return result.toString();
    }

    public void fillWithRandom(Random rnd) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                value[i][j] = rnd.nextInt(10);
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
            if (column != tmp.column || row != tmp.row)
                return true;
            else
                return false;
        }
    }
}
