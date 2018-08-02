package by.yasenchak.matrix.main;

import by.yasenchak.matrix.console_fill.ConsoleFill;
import by.yasenchak.matrix.creator.MatrixCreator;
import by.yasenchak.matrix.domain.Matrix;
import by.yasenchak.matrix.service.MatrixOperation;

import java.util.Arrays;
import java.util.regex.MatchResult;

public class Main {

    public static void main(String[] args) {
        double[][] arr = new double[][]{{0,0,1.2 ,0.0,0.8},{0.0, 4, 0, 2, 1}};
        Matrix matrix = new Matrix(arr);

//        Matrix matrix = MatrixCreator.createRandomArr(5, 5, -4, 4);

//        Matrix matrix = MatrixCreator.createFromFile("resurce/2");

//        Matrix matrix = ConsoleFill.getMatrixFromConsole();

        System.out.println(matrix.toString());
        MatrixOperation matrixOperation = new MatrixOperation(matrix);
        matrixOperation.sortMatrixRowValue(0);
        System.out.println(matrix.toString());
        double[] maxInRow = matrixOperation.findMaxInRow();
        System.out.println("Max elements in all Rows: " + Arrays.toString(maxInRow));
        double[] minInCol = matrixOperation.findMinInCol();
        
        System.out.println(Arrays.toString(minInCol));
        
        matrixOperation.zeroToRight();
        System.out.println("Zero right \n" + matrix.toString());
        matrixOperation.tranMatrix();
        System.out.println("Traspose matrix: " + matrix.toString());
        double[] sum = matrixOperation.getSumBtw();
        System.out.println("Sum: " + Arrays.toString(sum));
    }
}
