package by.yasenchak.matrix.creator;

import by.yasenchak.matrix.domain.Matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixCreator {
    private MatrixCreator(){}
   
    public static Matrix createRandomArr(int rowsCount, int columnCount, double firstRangeRand, double lastRangeRand) {
        double range = (lastRangeRand - firstRangeRand) + 1;
        Matrix matrix = new Matrix(rowsCount, columnCount);
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                matrix.setIndexMatrix(i, j, (int)(Math.random() * range) - lastRangeRand);
            }
        }
        return matrix;
    }


    public static Matrix createFromFile(String pathToFile) {
        File file = new File(pathToFile);
        int rowCount = 0, coltCount = 0;
        double[][] matrixFromFile = null;
        try {
            Scanner scanner = new Scanner(file);
            rowCount = scanner.nextInt();
            coltCount = scanner.nextInt();
            matrixFromFile = new double[rowCount][coltCount];
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < coltCount; j++) {
                    if(scanner.hasNextDouble()){
                        matrixFromFile[i][j] = scanner.nextDouble();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Matrix matrix = new Matrix(matrixFromFile);
        return matrix;
    }
}
