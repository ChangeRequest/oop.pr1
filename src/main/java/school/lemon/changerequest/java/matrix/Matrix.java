package school.lemon.changerequest.java.matrix;

/**
 * Created by Yaroslav Pavlinskiy on 12.12.2016.
 */
public class Matrix {

    private final int Rows; // count Rows
    private final int Columns; // count Columns
    private final int[][] data; // 2d array for matrix

    public Matrix(int R,int C)// Constructor with Rows and Columns
    {
        this.Rows = R;
        this.Columns = C;
        this.data = new int[R][C];
    }

    public Matrix(int[][]data) //Constructor 2d array
    {
        this.Rows = data.length;
        this.Columns = data[0].length;
        this.data = data;
    }
    private Matrix(Matrix A) { this(A.data); }

    public Matrix AddMatrix(Matrix B) // Method that adding matrix A and B
    {
        return Calculate(B,'+');
    }

    public Matrix SubtractMatrix(Matrix B)
    {
        return Calculate(B,'-');
    }

    public Matrix MultiplyNumber(int n)
    {
        Matrix A = this;
        Matrix C = new Matrix(Rows, Columns);
        for (int i = 0; i < Rows; i++)
            for (int j = 0; j < Columns; j++)
                C.data[i][j] = A.data[i][j] * n;
        return C;
    }

    public  Matrix MultiplyMatrix(Matrix B)
    {
        return Calculate(B,'*');
    }

    public Matrix Transpose()
    {
        Matrix A = this;
        Matrix C = new Matrix(Rows,Columns);
        for (int i = 0; i < Rows; i++)
            for (int j = 0; j < Columns; j++)
                C.data[i][j] = A.data[j][i];
        return C;
    }

    public Matrix Calculate(Matrix B,char d)
    {
        Matrix A = this;
        if (B.Rows != A.Rows || B.Columns != A.Columns) return null;
        Matrix C = new Matrix(Rows, Columns);
        switch (d)
        {
            case '*':
                for (int i = 0; i < Rows; i++)
                    for (int j = 0; j < Columns; j++)
                        C.data[i][j] = A.data[i][j] * B.data[i][j];
                break;
            case '+':
                for (int i = 0; i < Rows; i++)
                    for (int j = 0; j < Columns; j++)
                        C.data[i][j] = A.data[i][j] + B.data[i][j];
                break;
            case '-':
                for (int i = 0; i < Rows; i++)
                    for (int j = 0; j < Columns; j++)
                        C.data[i][j] = A.data[i][j] - B.data[i][j];
                break;

        }

        return C;
    }

    @Override
    public String toString() {
        for(int i = 0; i < Rows;i++)
        {
            for(int j = 0; j < Columns;j++)
            {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------");
        return "";
    }

}
