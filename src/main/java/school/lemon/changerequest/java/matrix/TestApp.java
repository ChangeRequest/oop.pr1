package school.lemon.changerequest.java.matrix;
import java.io.*;
/**
 * Created by Yaroslav Pavlinskiy on 12.12.2016.
 */
public class TestApp {

    public static void main(String[] args) {
        TestApp app = new TestApp();

        int[][]A = new int[2][2];//initialization matrix A
        int[][]B = new int[2][2];//initialization matrix

        A[0][0] = 4;
        A[0][1] = 2;
        A[1][0] = 9;
        A[1][1] = 0;

        B[0][0] = 3;
        B[0][1] = 1;
        B[1][0] = -3;
        B[1][1] = 4;

        Matrix a = new Matrix(A);
        System.out.println("Matrix A:");
        a.toString();

        Matrix b = new Matrix(B);
        System.out.println("Matrix B:");
        b.toString();

        System.out.println("Matrix Add:");
        a.AddMatrix(b).toString();

        System.out.println("Matrix Subtract:");
        a.SubtractMatrix(b).toString();

        System.out.println("MultiplayNumber:");
        a.MultiplyNumber(2).toString();

        System.out.println("MultiplayMatrix:");
        a.MultiplyMatrix(b).toString();

        System.out.println("Transpose Matrix:");
        a.Transpose().toString();





    }
}
